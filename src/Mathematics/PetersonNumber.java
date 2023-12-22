package Mathematics;

import static Mathematics.FactorialRecursive.factorial;

/*Write a program to check whether a given number is Peterson NUmber or not.
        A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.*/
public class PetersonNumber {
    public static boolean isPeterson(int num) {
        int n = num;
        int sum = 0;
        while (n > 0) {
            int factorial = factorial(n % 10);
            sum += factorial;
            n = n / 10;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 145;
        if (isPeterson(num)) {
            System.out.println("Is a Peterson Number.");
        } else {
            System.out.println("Is not a Peterson Number.");
        }
    }
}
