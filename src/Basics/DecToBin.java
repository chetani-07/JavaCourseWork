package Basics;

import java.util.ArrayList;
import java.util.ListIterator;

//Write a Java program to convert an integer number to a binary number.
public class DecToBin {
    public static void cnvrtToBin(int num) {
        ArrayList<Integer> bin = new ArrayList<Integer>();
        while (num > 0) {
            bin.add(num % 2);
            num = num / 2;
        }
        ListIterator<Integer> list = bin.listIterator(bin.size());
        while (list.hasPrevious()) {
            int digit = list.previous();
            System.out.print(digit);
        }
    }

    public static void main(String[] args) {
        int num = 2;
        System.out.print("Decimal To Binary:- ");
        cnvrtToBin(num);
    }
}
