package Mathematics;

/*  Task is to check whether the given number is am emirp number or not.
        A number is called an emirp number if we get another prime number on reversing the number itself.
            In other words, an emirp number is a number that is prime forwards or backward.
                It is also known as twisted prime numbers.
                    Note: Palindrome primes are excluded.   */

import static Mathematics.CheckPrime.isPrime;
import static Mathematics.PalindromeNumber.isPalindrome;
import static Mathematics.ReverseNumber.reverseNum;

public class EmirpNumbers {
    public static boolean isEmirpNumber(int num) {
        if (!isPalindrome(num)) {
            int reverse = reverseNum(num);
            if (isPrime(num) && isPrime(reverse)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 13;
        if (isEmirpNumber(num)) {
            System.out.println("Is an Emirp Number.");
        } else {
            System.out.println("Is Not an EmirpNumber.");
        }
    }
}
