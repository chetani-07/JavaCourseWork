package Arrays;

import java.util.ArrayList;

public class FindDuplicates {
    /*
    Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.
    Return the answer in ascending order. If no such element is found, return list containing [-1].
    Input:
    N = 5
    a[] = {2,3,1,2,3}
    Output:
    2 3
    Explanation:
    2 and 3 occur more than once in the given array.
    */

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int tmp[] = new int[n];

        for (int i = 0; i < n; i++) {
            tmp[arr[i]] += 1;
        }

        for (int i = 0; i < n; i++) {
            if (tmp[i] > 1) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        System.out.println(duplicates(arr, 5));
    }
}
