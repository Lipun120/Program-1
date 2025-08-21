package Calculator;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        // Create Calculator object and perform calculation
        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);

        // Display result
        System.out.println("Result: " + result);
    }
}


