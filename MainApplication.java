
import java.util.Scanner;


public class MainApplication {
    //Instance Variables
    static Scanner scanner = new Scanner(System.in);
    static String operator = "";
    static int numberOfInputs = 0;
    static String lastInput;
    static double[] inputs = new double[10];
    private static boolean exit = false;
    //Setting Instances
    static double displayValue = 0;
    static String displayMode = "dec";
    static boolean isRadians = false;
    static double memoryHold = 0;
    
    
    public static void main(String[] args) {
        while (exit == false){
            // Displays displayValue
            IOConsole.println(scientificCalculator.returnDisplayOf());
            // Prompts for Input
            lastInput = IOConsole.getStringInput("");
            // Check if input is operator or number
            if (!isNumeric(lastInput)){
                // If Operator
                // Checks if quit
                if (lastInput.equals("exit")) {
                    exit = true;
                    break;
                }
                // Checks for zero input operators and performs them
                
                // Display Mode
                
                else if (lastInput.equals("DM")) {
                    scientificCalculator.switchDisplayMode();
                }
                
                // Memory Operators
                else if (lastInput.equals("M+")) {
                    scientificCalculator.storeInMemory();
                }
                
                else if (lastInput.equals("MC")) {
                    scientificCalculator.resetMemory();
                }
                
                else if (lastInput.equals("MRC")) {
                    scientificCalculator.recallMemory();
                }
                
                // Trig Operators
                
                else if (lastInput.equals("SWRD")) {
                    scientificCalculator.switchUnitsMode();
                }
                
                
                // Checks for single input operators and performs them
                
                
                // Core Features
                
                else if (lastInput.equals("sq")) {
                    displayValue = CoreFeatures.square(displayValue);
                }
                
                else if (lastInput.equals("sqrt")) {
                    displayValue = CoreFeatures.squareroot(displayValue);
                }
                
                else if (lastInput.equals("1/x")) {
                    displayValue = CoreFeatures.inverseOfNumber(displayValue);
                }
                
                else if (lastInput.equals("+-")) {
                    displayValue = CoreFeatures.positiveOrNegative(displayValue);
                }
                
                // Trig Functions
                else if (lastInput.equals("sin")) {
                    displayValue = scientificCalculator.sin(displayValue);
                }
                
                else if (lastInput.equals("cos")) {
                    displayValue = scientificCalculator.cos(displayValue);
                }
                
                else if (lastInput.equals("tan")) {
                    displayValue = scientificCalculator.tan(displayValue);
                }
                
                else if (lastInput.equals("arcsin")) {
                    displayValue = scientificCalculator.arcsin(displayValue);
                }
                
                else if (lastInput.equals("arccos")) {
                    displayValue = scientificCalculator.arccos(displayValue);
                }
                
                else if (lastInput.equals("arctan")) {
                    displayValue = scientificCalculator.arctan(displayValue);
                }
                
                // Bonus Features
                
                else if (lastInput.equals("nlog")) {
                    displayValue = BonusFeatures.naturalLog(displayValue);
                }
                
                else if (lastInput.equals("inlog")) {
                    displayValue = BonusFeatures.inverseNaturalLog(displayValue);
                }
                
                else if (lastInput.equals("log")) {
                    displayValue = BonusFeatures.log(displayValue);
                }
                
                else if (lastInput.equals("ilog")) {
                    displayValue = BonusFeatures.inverseLog(displayValue);
                }
                
                else if (lastInput.equals("!")) {
                    displayValue = BonusFeatures.factorial(displayValue);
                }
                
                // Checks for double input operators 
                // or operators which require String input and performs them
                
                // Core Features
                
                else if (lastInput.equals("+")) {
                    double input = IOConsole.getDoubleInput("");
                    displayValue = CoreFeatures.sum(displayValue, input);
                }
                
                else if (lastInput.equals("-")) {
                    double input = IOConsole.getDoubleInput("");
                    displayValue = CoreFeatures.difference(displayValue, input);
                }
                
                else if (lastInput.equals("*")) {
                    double input = IOConsole.getDoubleInput("");
                    displayValue = CoreFeatures.product(displayValue, input);
                }
                
                else if (lastInput.equals("/")) {
                    double input = IOConsole.getDoubleInput("");
                    displayValue = CoreFeatures.division(displayValue, input);
                }
                
                else if (lastInput.equals("^")) {
                    double input = IOConsole.getDoubleInput("");
                    displayValue = CoreFeatures.exponential(displayValue, input);
                }
                
                // Display Mode Switching
                
                else if (lastInput.equals("DM+")) {
                    String input = IOConsole.getStringInput("");
                    scientificCalculator.switchDisplayMode(input);
                }
                
                // Trig Functions
                
                else if (lastInput.equals("SWRDI")) {
                    String input = IOConsole.getStringInput("");
                    scientificCalculator.switchUnitsMode(input);
                }
                
                // Bonus Features
                
                else if (lastInput.equals("perm")) {
                    double input = IOConsole.getDoubleInput("");
                    displayValue = BonusFeatures.permutation(displayValue, input);
                }
                
                else if (lastInput.equals("comb")) {
                    double input = IOConsole.getDoubleInput("");
                    displayValue = BonusFeatures.combinations(displayValue, input);
                }
                
                // Method Not Found
                
                else {
                    IOConsole.println("Operation Not Found");
                }
            }
            // if Input is numeric
            else {
                displayValue = Double.valueOf(lastInput);
            }
        }
    }
    
    public static boolean isNumeric(String str) {  
        try {  
            double d = Double.parseDouble(str);  
        }  
        catch(NumberFormatException nfe) {  
            return false;  
        }  
        return true;  
    }
}

    
    