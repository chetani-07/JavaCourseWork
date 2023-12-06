package Mathematics;
public class PalindromeNumber {
    /*
    Given an integer, write a function that returns true if the given number is palindrome, else false.
    For example, 12321 is palindrome, but 1451 is not palindrome.
    */

    public static boolean isPalindrome(int num) {
        int tmp = num;
        int rev = 0;
        while (tmp > 0) {
            rev = rev * 10 + (tmp % 10);
            tmp = tmp / 10;
        }
        if (rev == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1234));
    }

}
