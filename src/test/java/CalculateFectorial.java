import java.util.Scanner;

public class CalculateFectorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

}
