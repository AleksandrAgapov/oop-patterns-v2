package patterns.structural.wrappers.decorator.task.impl;

import patterns.structural.wrappers.decorator.task.Calculable;

public class CalculatorWithLogger implements Calculable {

    private Calculable calculable;

    public CalculatorWithLogger(Calculable calculable) {
        this.calculable = calculable;
    }

    @Override
    public void sum(double a, double b) {
        System.out.printf("Sumrize %s and %s", a, b);
        calculable.sum(a, b);
        System.out.println(result());
    }

    @Override
    public void multiply(double a, double b) {
        System.out.printf("multiply %s and %s", a, b);
        calculable.multiply(a, b);
        System.out.printf("Result = %s", result());
    }

    @Override
    public void divide(double a, double b) {
        System.out.printf("divide %s and %s", a, b);
        System.out.printf("Result = %s", result());
    }

    @Override
    public void subtraction(double a, double b) {
        System.out.printf("subtraction %s and %s", a, b);
        System.out.printf("Result = %s", result());
    }

    @Override
    public double result() {
        return calculable.result();
    }

    @Override
    public void clear() {
        System.out.println("Clearing");
        calculable.clear();
    }
}
