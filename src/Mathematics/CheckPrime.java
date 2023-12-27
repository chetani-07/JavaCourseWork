package Mathematics;

// Task is to find that given number is a Prime Number or not.
public class CheckPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 2;
        if (isPrime(num)) {
            System.out.println("Is Prime.");
        } else {
            System.out.println("Is Not Prime.");
        }
    }
}
