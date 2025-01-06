public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 8;
        System.out.println("Is Armstrong: " + isArmstrong(number));
    }

    public static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }
}
