package Basics;

// Task is to find the count of smaller or equal elements present than the given number.
public class CountOfElementsSmaller {
    public static int countOfElementsSmaller(int arr[], int n, int num) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= num) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 10};
        int num = 9;
        System.out.println("Required Count: " + countOfElementsSmaller(arr, 6, num));
    }
}
