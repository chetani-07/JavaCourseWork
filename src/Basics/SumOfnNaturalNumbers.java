package Basics;

// Task is to find Sum of n Natural Numbers.
public class SumOfnNaturalNumbers {
    public static int sumOfnNumbers(int num) {
        int sum = (num * (num + 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Sum of Given n Natural Numbers is " + sumOfnNumbers(num));
    }
}
