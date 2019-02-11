
/**
 * Write a description of class IOConsole here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class readerApp extends MainApplication
{
    // instance variables - replace the example below with your own
    
    private static Scanner scanner;
    private static String operator;
    static int numberOfInputs;
    static double[] inputs;
    
    //Constructor
    
    
    public readerApp(Scanner scanner, String operator, double[] inputs){
        this.scanner = new Scanner(System.in);;
        this.operator = operator;
        this.inputs = inputs;
    }
    
    
   
    
    // Methods
    
    
    private static double ask(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    
    public static void main(String[] args) {
    
    System.out.println("Please input an operator");
    operator = scanner.next();
    double answer = 0;
    System.out.println(operator);
    if (operator.equals("+") || operator.equals("-")) {
        numberOfInputs = 2;
    }
   
    if (operator.equals("!")) {
        numberOfInputs = 1;
    }
    
    //getInputs(scanner);
    
    
    for (int i = 0; i < numberOfInputs; i++){
        inputs[i] = ask(scanner, "Please enter next input");
    }
    
    if (operator.equals("+")) {
        answer = sum(inputs[0], inputs[1]);
    }
    
    if (operator.equals("!")) {
        answer = factorial(inputs[0]);
    }
    
    System.out.println(answer);
}

    public void display(double first,String operator, double second, double result ){
       System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
    
    public static void getInputs(Scanner scanner) {
        for (int i = 0; i < numberOfInputs; i++){
        inputs[i] = ask(scanner, "Please enter next input");
    }
    }
     
    
    public static double sum(double input1, double input2){
        return input1 + input2;
    }
    
    public static double factorial(double input1) {
        int answer = 1;
        int start = (int)input1;
        for (int i = 1; i <= input1; i++) {
            answer = answer * i;
        }
        return (double)answer;
    }


}
