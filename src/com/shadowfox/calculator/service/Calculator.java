package com.shadowfox.calculator.service;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }

    public double squareRoot(double num) {
        if (num < 0) {
            System.out.println("Square root of negative number is not possible.");
            return 0;
        }
        return Math.sqrt(num);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
