package Mathematics;

import static Mathematics.GCD.gcd;

//LCM (Least Common Multiple) of two numbers is the smallest number which can be divided by both numbers.
public class LCM {
    public static int lcm(int a, int b) {
        int res = a * b / gcd(a, b);
        return res;
    }

    public static void main(String[] args) {
        int a = 15, b = 55;
        System.out.println("LCM of Given Numbers :- " + lcm(a, b));
    }
}
