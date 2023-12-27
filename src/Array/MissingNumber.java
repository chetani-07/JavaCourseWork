package Array;

public class MissingNumber {

    /*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
    Input:
    N = 5
    A[] = {1,2,3,5}
    Output: 4
    */
    public static int missingNumber(int arr[], int n) {
        int sum = (n * (n + 1)) / 2;
        int total = 0;
        for (int j = 0; j < n - 1; j++) {
            total = total + arr[j];
        }
        return (sum - total);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println("Missing Number in Array: " + missingNumber(arr, 4));
    }
}
