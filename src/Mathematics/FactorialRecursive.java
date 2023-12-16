package Mathematics;

public class FactorialRecursive {
    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of  Number:- " + factorial(num));
    }
}
