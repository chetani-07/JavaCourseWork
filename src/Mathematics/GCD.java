package Mathematics;

public class GCD {
    //GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them.
    public static int gcd(int a, int b) {
        if (a == b)
            return a;
        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(b - a, a);
        }
    }

    public static void main(String[] args) {
        int a = 15, b = 65;
        System.out.println("HCF of Given Numbers:- " + gcd(a, b));
    }
}
