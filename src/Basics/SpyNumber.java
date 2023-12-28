package Basics;

import static Mathematics.ProductOfDigits.productOfDigits;
import static Mathematics.SumOfDigits.sumOfDigits;

/* Task is to find the given number is a Spy Number or not.
        A positive integer is called a spy number if the sum and product of its digits are equal. */
public class SpyNumber {
    public static boolean isSpyNumber(int num) {
        int sum_Of_Digits = sumOfDigits(num);
        int product_Of_Digits = productOfDigits(num);
        if (sum_Of_Digits != product_Of_Digits) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1124;
        if (isSpyNumber(num)) {
            System.out.println("Is a Spy Number.");
        } else {
            System.out.println("Is not a Spy Number.");
        }
    }
}
