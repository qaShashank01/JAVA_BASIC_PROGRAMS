public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 17;
        System.out.println("Is Prime: " + isPrime(number));
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            System.out.println(i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
