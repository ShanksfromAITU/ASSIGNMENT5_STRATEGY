package calculator;

import calculator.strategy.AddStrategy;
import calculator.strategy.DivideStrategy;
import calculator.strategy.MultiplyStrategy;
import calculator.strategy.SubtractStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator(new AddStrategy());

        double result = calculator.calculate(10, 5);

        assertEquals(15, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        Calculator calculator = new Calculator(new SubtractStrategy());

        double result = calculator.calculate(10, 5);

        assertEquals(5, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        Calculator calculator = new Calculator(new MultiplyStrategy());

        double result = calculator.calculate(10, 5);

        assertEquals(50, result);
    }

    @Test
    void shouldDivideTwoNumbers() {
        Calculator calculator = new Calculator(new DivideStrategy());

        double result = calculator.calculate(10, 5);

        assertEquals(2, result);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        Calculator calculator = new Calculator(new DivideStrategy());

        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculate(10, 0)
        );
    }
}