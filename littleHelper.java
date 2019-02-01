import java.util.InputMismatchException;
import java.util.Scanner;

public class littleHelper {

    /**
     * Read some text from the console.
     * @param text The text to display in front of the text input area.
     * @return The entered text
     */
    public static String readString(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print(text);
        String s = in.nextLine();
        return s;
    }

    /**
     * Read some text from the console.
     * @return The entered text
     */
    public static String readString() {
        return readString("Input: ");
    }

    /**
     * Read a single integer from the console.
     * @param text The text to display in front of the number input area.
     * @return The entered integer. If no integer could be read, the output will be -2147483648 (Lowest integer value).
     */
    public static int readInt(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print(text);
        try {
            return in.nextInt();
        } catch (InputMismatchException e) {
            return Integer.MIN_VALUE;
        }
    }

    /**
     * Read a single integer from the console.
     * @return The entered integer. If no integer could be read, the output will be -2147483648 (Lowest integer value).
     */
    public static int readInt() {
        return readInt("Enter a whole number: ");
    }

    /**
     * Read a single double precision floating point number from the console.
     * @param text The text to display in front of the number input area.
     * @return The entered double. If no double could be read, the output will be NaN (Not a Number).
     */
    public static double readDouble(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print(text);
        try {
            return in.nextDouble();
        } catch (InputMismatchException e) {
            return Double.NaN;
        }
    }

    /**
     * Read a single double precision floating point number from the console.
     * @return The entered double. If no double could be read, the output will be NaN (Not a Number).
     */
    public static double readDouble() {
        return readDouble("Enter a floating point number: ");
    }


    /**
     * Write text to the console.
     * @param output The text to output to the console.
     */
    public static void write(String output) {
        System.out.print(output);
    }

    /**
     * Write an integer to the console.
     * @param output The integer to output to the console.
     */
    public static void write(int output) {
        write("" + output);
    }

    /**
     * Write a double precision floating point number (double) to the console.
     * @param output The double to output to the console.
     */
    public static void write(double output) {
        write("" + output);
    }

    /**
     * Write text to the console and create a new line..
     * @param output The text to output to the console.
     */
    public static void writeLine(String output) {
        System.out.println(output);
    }

    /**
     * Write an integer to the console and create a new line..
     * @param output The integer to output to the console.
     */
    public static void writeLine(int output) {
        writeLine("" + output);
    }

    /**
     * Write a double precision floating point number (double) to the console and create a new line.
     * @param output The double to output to the console.
     */
    public static void writeLine(double output) {
        writeLine("" + output);
    }


    /**
     * Generate a random number between min and max.
     * @param min The smallest number to generate (inclusive).
     * @param max The largest number to generate (inclusive).
     * @return A random number.
     */
    public static int generateRandomNumber(int min, int max){
        return min + new java.util.Random().nextInt(max-min+1);
    }


    /**
     * Throw a single six sided dice.
     * @return The number on the dice (1 to 6).
     */
    public static int dice(){
        return generateRandomNumber(1,6);
    }
}
