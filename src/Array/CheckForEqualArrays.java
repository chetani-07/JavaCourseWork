package Array;
/*  Task is to find if given arrays are equal or not. (Given Two equal sized arrays).
        Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of
            elements may be different though.
                Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.  */

import java.util.Arrays;

public class CheckForEqualArrays {
    public static boolean checkEqualArrays(int[] A, int[] B, int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 22, 14, 50, 34};
        int[] B = {22, 50, 34, 14, 5, 2};
        if (checkEqualArrays(A, B, 6)) {
            System.out.println("Given Arrays are Equal.");
        } else {
            System.out.println("Given Arrays are Not Equal.");
        }
    }
}
