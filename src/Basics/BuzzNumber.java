package Basics;

/*  Task is to find whether the given number is a Buzz Number or not.
         A number is said to be Buzz if it ends with 7 or is divisible by 7.    */
public class BuzzNumber {
    public static boolean isBuzzNumber(int num) {
        int last_digit = num % 10;
        return last_digit == 7 || num % 7 == 0;
    }

    public static void main(String[] args) {
        int num = 49;
        if (isBuzzNumber(num)) {
            System.out.println("Is a Buzz Number.");
        } else {
            System.out.println("Is Not a Buzz Number.");
        }
    }
}
