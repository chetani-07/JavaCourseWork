package Mathematics;

import static Mathematics.SumOfDigits.sumOfDigits;

/*  Task is to find whether the given number is a Neon Number or not.
 *       A positive integer whose sum of digits of its square is equal to the number itself is called a neon number. */
public class NeonNumber {
    public static boolean isNeonNumber(int num) {
        int square = (int) Math.pow(num, 2);
        int sumOfDigits = sumOfDigits(square);
        return num == sumOfDigits;
    }

    public static void main(String[] args) {
        int num = 9;
        if (isNeonNumber(num)) {
            System.out.println("Is a Neon Number.");
        } else {
            System.out.println("Is not a Neon Number.");
        }
    }
}
