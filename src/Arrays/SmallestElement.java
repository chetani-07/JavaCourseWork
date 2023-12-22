package Arrays;

//Task is to find the smallest element in the Given Array.
public class SmallestElement {
    public static int findSmallest(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < res) {
                res = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 11, 32, 12, 2};
        int n = 5;
        System.out.println("Smallest Element in given Array is " + findSmallest(arr, n));
    }
}
