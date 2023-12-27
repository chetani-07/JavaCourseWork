package Searching;

/*  Task -  Given a sorted array of size N and an integer K, find the position(0-based indexing)
        at which K is present in the array using binary search. */
public class BinarySearch {
    public static int binarySearch(int[] arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int res = binarySearch(arr, 5, 7);
        if (res != -1) {
            System.out.println("Present at index: " + res);
        } else {
            System.out.println("Not Present in the Array.");
        }
    }

}
