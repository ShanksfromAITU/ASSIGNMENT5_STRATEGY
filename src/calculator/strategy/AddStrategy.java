package calculator.strategy;

public class AddStrategy implements OperationStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}