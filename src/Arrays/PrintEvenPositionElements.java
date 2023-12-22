package Arrays;

//Task is to print all the elements present at even positions (Consider 1-Based Indexing/Positions).
public class PrintEvenPositionElements {
    public static void printEvenPosition(int arr[], int n) {
        for (int i = 1; i < n; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 11};
        int n = 5;
        System.out.print("Even Positioned Elements in Given Array are - ");
        printEvenPosition(arr, n);
    }
}
