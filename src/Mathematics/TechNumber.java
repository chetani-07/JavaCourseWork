package Mathematics;
//Task is to find whether the given number is a Tech Number or not.
   /* A number is called a Tech number if the given number has an even number of digits and
        the number can be divided exactly into two parts from the middle.
            After equally dividing the number,sum up the numbers and find the square of the sum.
                If we get the number itself as square,the given number is a tech number,else,not a tech number.
                    For example,3025is a tech number.*/

import static Mathematics.BreakIntoHalves.breakIntoEqualHalves;
import static Mathematics.CountDigits.countDigits;

public class TechNumber {
    public static boolean isTechNumber(int num) {
        int count_digits = countDigits(num);
        if (count_digits % 2 != 0) {
            return false;
        } else {
            int[] arr = breakIntoEqualHalves(num, count_digits);
            int SquareOfSum = (int) Math.pow(arr[0] + arr[1], 2);
            if (num == SquareOfSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 3025;
        if (isTechNumber(num)) {
            System.out.println("Is a Tech Number.");
        } else {
            System.out.println("Is not a Tech Number.");
        }
    }
}
