package Arrays;

//Task is to print all the elements present at odd positions (Consider 1-Based Indexing/Positions).
public class PrintOddPositionElements {
    public static void printOddPosition(int arr[], int n) {
        for (int i = 0; i < n; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 11};
        int n = 5;
        System.out.print("Odd Positioned Elements in Given Array are - ");
        printOddPosition(arr, n);
    }
}
