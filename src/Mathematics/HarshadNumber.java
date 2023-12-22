package Mathematics;

import static Mathematics.SumOfDigits.sumOfDigits;

/*  Task is to check whether a given number is Harshad Number or not.
        A number is said to be the Harshad number if it is divisible by the sum of its digit.   */
public class HarshadNumber {
    public static boolean isHarshad(int num) {
        int sumOfDigits = sumOfDigits(num);
        if (num % sumOfDigits == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 135;
        if (isHarshad(num)) {
            System.out.println("Is a Hasrhad Number.");
        } else {
            System.out.println("Is not a Harshad Number.");
        }
    }

}
