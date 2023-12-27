package Array;
// Task is to check whether the given array is Palindromic or not.For this all the elements should be Palindromes.

import static Mathematics.PalindromeNumber.isPalindrome;

public class PalindromicArray {
    public static boolean isPalindromicArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        if (isPalindromicArray(arr, 5)) {
            System.out.println("Is Palindromic.");
        } else {
            System.out.println("Is not Palindromic.");
        }
    }
}

