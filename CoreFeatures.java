
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
