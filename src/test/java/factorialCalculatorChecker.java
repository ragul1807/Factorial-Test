import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class factorialCalculatorChecker {
    @Test
    void shouldReturn120WhenValueIs5() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(5);
        long factorialResult;

        factorialResult=factorialCalculator.factorial();

        assertEquals(factorialResult,120);
    }

    @Test
    void shouldReturn479001600WhenValueIs12() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(12);
        long factorialResult;

        factorialResult=factorialCalculator.factorial();

        assertEquals(factorialResult,479001600);
    }

    @Test
    void shouldReturn1WhenValueIs1() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(0);
        long factorialResult;

        factorialResult=factorialCalculator.factorial();

        assertEquals(factorialResult,1);

    }

    @Test
    void shouldReturnNegativeOneWhenValueIsNegative() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(-1);
        long factorialResult;

        factorialResult = factorialCalculator.factorial();

        assertEquals(factorialResult,-1);
    }
}
