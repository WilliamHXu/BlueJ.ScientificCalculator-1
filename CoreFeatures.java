
/**
 * Write a description of class CoreFeatures here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class CoreFeatures extends MainApplication
{
    private static Scanner scanner = new Scanner(System.in);
    private static String operator = "";
    static int numberOfInputs = 0;
    static double[] inputs = new double[10];
    static String s = "Error";
    
    private static double ask(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();}
   
    
    public void display(double first,String operator, double second, double result ){
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
  
public static void main(String[] args) {
    MainApplication ma = new MainApplication();
    String s = "Error";
    System.out.println("Please input an operator from below");
    System.out.println("+ "+"- "+"* "+"/ "+"^ "+"sq  "+"sqrt "+"1/x "+"+or-");
    operator = scanner.next();
    double answer = 0;
    System.out.println(operator);
    if (operator.equals("+") || operator.equals("-")||operator.equals("*") ||operator.equals("/") ||operator.equals("^")) {
        numberOfInputs = 2;
    }
   
    if (operator.equals("sq")||operator.equals("sqrt")||operator.equals("1/x")||operator.equals("+or-")) {
        numberOfInputs = 1;
     
    }
    
    
    for (int i = 0; i < numberOfInputs; i++){
        inputs[i] = ask(scanner, "Please enter next input");
    }
    
    if (operator.equals("+")) {
        answer = sum(inputs[0], inputs[1]);
    }
    
    if (operator.equals("-")) {
        answer = difference(inputs[0], inputs[1]);
    }
    
    if (operator.equals("*")) {
        answer = product(inputs[0], inputs[1]);
    }
    
    if (operator.equals("/")) {
        answer = division(inputs[0], inputs[1]);
    }
    
    if (operator.equals("sq")) {
        answer = square(inputs[0]);
    }
    
    if (operator.equals("sqrt")) {
        answer = squareroot(inputs[0]);
    }
    
    if (operator.equals("^")) {
        answer = exponential(inputs[0], inputs[1]);
    }
    
    if (operator.equals("1/x")) {
        answer = inverseOfNumber(inputs[0]);
    }
    
    if (operator.equals("+or-")) {
        answer = positiveOrNegative(inputs[0]);
    
}
    System.out.println(answer);
}
    
    public static void getInputs(Scanner scanner) {
        for (int i = 0; i < numberOfInputs; i++){
        System.out.println("Please enter next input");
        inputs[i] = scanner.nextDouble();
    }
    }   
    
    public static double sum(double input1, double input2){
        return input1 + input2;
    }
    
    public static double difference(double input1, double input2){
        return input1 - input2;
    }
    public static double product(double input1, double input2){
        return input1 * input2;
    }
    
    public static double division(double input1, double input2){
        if (input2==0)
            
            return Double.POSITIVE_INFINITY;
        else
        return input1 / input2;
    }
    public static double square(double input1){
        return Math.pow(input1,2);
    }
    
    public static double squareroot(double input1) {
        return  Math.sqrt(input1);
    }
    public static double exponential(double input1, double input2){
        return Math.pow(input1,input2);
    }
   public static double inverseOfNumber(double input1)
   {
        return 1/input1;
    }
    
    public static double positiveOrNegative(double input1)
   {
        return input1*=-1;
    }
     
    
    
}
