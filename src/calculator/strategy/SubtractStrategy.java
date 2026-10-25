package calculator.strategy;

public class SubtractStrategy implements OperationStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}