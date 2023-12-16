package Mathematics;

public class Factorial {

    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of Number:- " + factorial(num));
    }
}
