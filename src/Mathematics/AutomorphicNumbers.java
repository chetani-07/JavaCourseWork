package Mathematics;

import static Mathematics.CountDigits.countDigits;
import static Mathematics.ReverseNumber.reverseNum;

/*Write a program that check whether a given number is automorphic or not.
        A number is called an automorphic number if and only if the square of the given number ends with the same number itself.*/
public class AutomorphicNumbers {
    public static boolean isAutomorphic(int num) {
        int cnt = countDigits(num);
        int square = num * num;
        int n = 0;
        while (cnt > 0) {
            n = n * 10 + (square % 10);
            square /= 10;
            cnt -= 1;
        }
        n = reverseNum(n);
        if (n == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 25;
        if (isAutomorphic(num)) {
            System.out.println("Is an Automorphic.");
        } else {
            System.out.println("Not an Automorphic.");
        }
        num = 9;
        if (isAutomorphic(num)) {
            System.out.println("Is an Automorphic.");
        } else {
            System.out.println("Not an Automorphic.");
        }

    }

}
