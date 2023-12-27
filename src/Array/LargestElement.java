package Array;

//Task is to find the largest element in the given array.
public class LargestElement {
    public static int findLargest(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > res) {
                res = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 45, 21, 65, 78, 93, 21};
        int n = 7;
        System.out.println("Largest Element in Given Array is " + findLargest(arr, n));
    }
}
