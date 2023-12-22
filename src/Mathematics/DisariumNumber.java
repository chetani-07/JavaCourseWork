package Mathematics;

import static Mathematics.CountDigits.countDigits;

/*  A number is said to be the Disarium number when the sum of its digit raised to the power of their respective
        positions is equal to the number itself.
                1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175    */
public class DisariumNumber {
    public static boolean isDisarium(int num) {
        int count = countDigits(num);
        int n = num;
        int sum = 0;
        while (n > 0) {
            sum = (int) (sum + Math.pow(n % 10, count));
            n /= 10;
            count -= 1;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 175;
        if (isDisarium(num)) {
            System.out.println("Is Disarium Number.");
        } else {
            System.out.println("Is not a Disarium Number.");
        }
    }
}
