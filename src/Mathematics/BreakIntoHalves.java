package Mathematics;

public class BreakIntoHalves {

    public static int[] breakIntoEqualHalves(int num, int length) {
        int[] list = new int[2];
        int midpoint = length / 2;

        String numStr = Integer.toString(num);
        String firstHalfStr = numStr.substring(0, midpoint);
        String secondHalfStr = numStr.substring(midpoint);

        list[0] = Integer.parseInt(firstHalfStr);
        list[1] = Integer.parseInt(secondHalfStr);
        return list;
    }

    public static void main(String[] args) {
        int num = 3025;
        int[] arr = breakIntoEqualHalves(num,4);
        System.out.println("Half 1: " + arr[0] + " Half 2: " + arr[1]);
    }
}
