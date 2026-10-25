package calculator.strategy;

public class MultiplyStrategy implements OperationStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}