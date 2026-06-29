package com.shadowfox.calculator;

import com.shadowfox.calculator.service.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int choice;

        do {
            System.out.println("\n========== ENHANCED CALCULATOR ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            double num1, num2;

            switch (choice) {

                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + calculator.add(num1, num2));
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + calculator.subtract(num1, num2));
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + calculator.multiply(num1, num2));
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + calculator.divide(num1, num2));
                    break;

                case 5:
                    System.out.print("Enter Base Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Power: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + calculator.power(num1, num2));
                    break;

                case 6:
                    System.out.print("Enter Number: ");
                    num1 = sc.nextDouble();

                    System.out.println("Result = " + calculator.squareRoot(num1));
                    break;

                case 7:
                    System.out.println("Thank you for using Enhanced Calculator.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}