# Assignment 5 — Strategy Pattern

## Calculator Strategy Pattern

This project demonstrates the Strategy Design Pattern using a simple calculator written in Java.

The calculator supports four operations:

- Addition
- Subtraction
- Multiplication
- Division

Each mathematical operation is implemented as a separate strategy that follows the common `OperationStrategy` interface.

## Project Structure

- `OperationStrategy` — common Strategy interface.
- `AddStrategy` — performs addition.
- `SubtractStrategy` — performs subtraction.
- `MultiplyStrategy` — performs multiplication.
- `DivideStrategy` — performs division.
- `Calculator` — Context that stores and uses the current strategy.
- `Main` — Client that creates the calculator and changes strategies at runtime.
- `CalculatorTest` — unit tests for calculator operations.

## Strategy Pattern

The Strategy Pattern allows different algorithms to be placed in separate classes and used through one common interface.

The `Calculator` does not contain the logic of mathematical operations. Instead, it delegates the calculation to the selected strategy.

The strategy can be changed at runtime using the `setStrategy()` method.

## Clean Code

The project applies Clean Code principles from Chapters 9, 10, and 11:

- Clean and independent unit tests
- One responsibility per class
- Small classes
- Dependency Injection
- Separation of object construction from object use

## Technologies

- Java 17
- IntelliJ IDEA
- JUnit 5
- Git and GitHub