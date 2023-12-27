package Array;

//Task is to print the elements of an array in reverse order.
public class PrintReverse {
    public static void printReverse(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 4};
        int n = 5;
        System.out.print("Array Elements in Reverse Order are - ");
        printReverse(arr, n);
    }
}
