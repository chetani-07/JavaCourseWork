package Arrays;

//Given an array arr[] of no-negative integers, the task is to find the elements of a contiguous subarray of numbers that has the largest sum.
public class MaximumSubarraySum {
    public static int maxSubArraySum(int[] arr, int n) {

        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println("Maximum SubArray Sum obtained " + maxSubArraySum(arr, 3));
    }
}

