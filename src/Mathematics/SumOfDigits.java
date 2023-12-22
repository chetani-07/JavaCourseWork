package Mathematics;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int res = 0;
        while (num > 0) {
            res = res + (num % 10);
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of Digits for given Number is " + sumOfDigits(num));
    }
}
