package Mathematics;

public class CountDigits {
    /*
    Given a number N, the task is to return the count of digits in this number.
    */

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count += 1;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count of Digits:- " + countDigits(12300));
    }
}
