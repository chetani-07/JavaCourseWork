package Mathematics;

import static Mathematics.CountDigits.countDigits;

public class ArmstrongNumbers {
    //    An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
    public static boolean isArmstrong(int num) {
        int d = countDigits(num);
        int sum = 0;
        int tmp = num;
        while (tmp > 0) {
            double n = Math.pow(tmp % 10, d);
            sum += n;
            tmp = tmp / 10;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println("Is a Armstrong Number.");
        } else {
            System.out.println("Not a Armstrong Number.");
        }
    }
}
