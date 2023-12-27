package Basics;

import java.util.ArrayList;

//Task is to Swap the given two numbers and print them. (Try to do it without a temporary variable.) and return it.
public class SwapVariables {
    public static ArrayList<Integer> swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        return list;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 50;
        System.out.println("Before Swap | num1: " + num1 + " & num2: " + num2);
        ArrayList<Integer> res = swap(num1, num2);
        System.out.println("After Swap | num1: " + res.get(0) + " & num2: " + res.get(1));

    }
}
