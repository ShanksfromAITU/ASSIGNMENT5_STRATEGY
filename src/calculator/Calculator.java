package calculator;

import calculator.strategy.OperationStrategy;

public class Calculator {

    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double firstNumber, double secondNumber) {
        return strategy.calculate(firstNumber, secondNumber);
    }
}