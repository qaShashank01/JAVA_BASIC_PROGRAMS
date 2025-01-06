import java.util.Scanner;

public class ErrorHandling {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1, num2, result;

            try {
                System.out.print("Enter two numbers: ");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
            } finally {
                scanner.close();
            }
        }
    }