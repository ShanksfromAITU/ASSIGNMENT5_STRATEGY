package calculator;

import calculator.strategy.AddStrategy;
import calculator.strategy.DivideStrategy;
import calculator.strategy.MultiplyStrategy;
import calculator.strategy.SubtractStrategy;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new AddStrategy());

        double firstNumber = 10;
        double secondNumber = 5;

        System.out.println("Addition: " +
                calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new SubtractStrategy());

        System.out.println("Subtraction: " +
                calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new MultiplyStrategy());

        System.out.println("Multiplication: " +
                calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new DivideStrategy());

        System.out.println("Division: " +
                calculator.calculate(firstNumber, secondNumber));
    }
}