import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorChecker {
    @Test
    void CheckValueOfFactorialFive() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(5);
        long factorialResult;
        factorialResult=factorialCalculator.factorial();
        assertEquals(factorialResult,120);
    }

    @Test
    void CheckValueFactorial12() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(12);
        long factorialResult;
        factorialResult=factorialCalculator.factorial();
        assertEquals(factorialResult,479001600);
    }

}
