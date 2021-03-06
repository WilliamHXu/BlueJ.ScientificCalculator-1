
/**
 * Bonus features for the calculator project
 *
 * @Arcelia Calleja
 * @2/10/19
 */
public class BonusFeatures
{

    public static double naturalLog(double num){
        return Math.log(num);
    }

    public static double inverseNaturalLog(double num){
        double inverse = Math.pow(Math.E,num);
        return inverse;
    }

    public static double log(double num){
        return Math.log10(num);
    }

    public static double inverseLog(double num){
        double inverse = Math.pow(10,num);
        return inverse;
    }

    public static double factorial(double num){
        double factorial=1;
        for(double i=1; i<=num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static double permutation(double n, double r){
        double permutation;

        permutation = BonusFeatures.factorial(n)/BonusFeatures.factorial(n-r);
        return permutation;
    }

    public static double combinations(double n,double r){
        double combinations;
        combinations = BonusFeatures.factorial(n)/(BonusFeatures.factorial(n-r)*BonusFeatures.factorial(r));
        return combinations;
    }

