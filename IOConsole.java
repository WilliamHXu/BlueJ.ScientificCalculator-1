 

/**
 * @author leon on 03/02/2019.
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole extends MainApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static PrintStream out = System.out;

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public static void print(String val, Object... args) {
        out.format(val, args);
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public static void println(String val, Object... args) {
        print(val + "\n" , args);
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public static String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.next();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public static Integer getIntegerInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextInt();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public static Double getDoubleInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextDouble();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */ // TODO - Change recursion to iteration
    public static Float getFloatInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextFloat();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */ // TODO - Change recursion to iteration
    public static Long getLongInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextLong();
    }
}