package calculator.compoundInterest;

import org.springframework.stereotype.Component;

@Component
public class CompoundInterestCalculator {

    public double calcCompoundInterest(double principal, double rate, int years) {
        // Convert the annual rate to decimal
        double r = rate / 100.0;

        // Calculate compound interest using the powerFunction from Pow class
        double amount = principal * Pow.powerFunction(1 + r / 1, 1 * years);

        // Calculate the interest earned
        double compoundInterest = amount - principal;

        return compoundInterest + principal;
    }
}