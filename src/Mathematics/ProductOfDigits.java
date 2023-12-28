package Mathematics;

// Task is to find  the product of digits of a given number.
public class ProductOfDigits {
    public static int productOfDigits(int num) {
        int prod = 1;
        while (num > 0) {
            prod = prod * (num % 10);
            num = num / 10;
        }
        return prod;
    }

    public static void main(String[] args) {
        int num = 1231;
        System.out.println("Product of Digits: " + productOfDigits(num));
    }
}
