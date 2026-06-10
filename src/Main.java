import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int choice;

        do {

            System.out.println("\n===== ENHANCED CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Celsius to Fahrenheit");
            System.out.println("8. Fahrenheit to Celsius");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter first number: ");
                        double num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        double num2 = sc.nextDouble();

                        System.out.println("Result = " + calculator.add(num1, num2));
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calculator.subtract(num1, num2));
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calculator.multiply(num1, num2));
                        break;

                    case 4:
                        System.out.print("Enter dividend: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter divisor: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calculator.divide(num1, num2));
                        break;

                    case 5:
                        System.out.print("Enter a number: ");
                        num1 = sc.nextDouble();

                        System.out.println("Square Root = " + calculator.squareRoot(num1));
                        break;

                    case 6:
                        System.out.print("Enter base: ");
                        double base = sc.nextDouble();

                        System.out.print("Enter exponent: ");
                        double exponent = sc.nextDouble();

                        System.out.println("Result = " + calculator.power(base, exponent));
                        break;

                    case 7:
                        System.out.print("Enter temperature in Celsius: ");
                        double celsius = sc.nextDouble();

                        System.out.println("Temperature in Fahrenheit = "
                                + calculator.celsiusToFahrenheit(celsius));
                        break;

                    case 8:
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double fahrenheit = sc.nextDouble();

                        System.out.println("Temperature in Celsius = "
                                + calculator.fahrenheitToCelsius(fahrenheit));
                        break;

                    case 9:
                        System.out.println("Thank you for using Calculator!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 9);

        sc.close();
    }
}