package Basics;

//Write a Java program to convert a binary number to a decimal number.
public class BinToDec {
    public static int binaryToDecimal(int bin) {
        int num = 0, cnt = 0;
        while (bin > 0) {
            int digit = bin % 10;
            bin = bin / 10;
            num = (int) (num + (digit * Math.pow(2, cnt)));
            cnt += 1;
        }
        return num;
    }

    public static void main(String[] args) {
        int binary = 101;
        System.out.println("Decimal Conversion for Given Binary Number :- " + binaryToDecimal(binary));
    }
}
