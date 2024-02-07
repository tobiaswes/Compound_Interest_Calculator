package calculator.compoundInterest;

public class Pow {

    public static double powerFunction(double base, double exponent){

        if(exponent == 0){
            return 1;
        }

        double result = 1;
        for (int i = 0; i < exponent; i++){
            result *= base;
        }
        return result;
    }
}
