package Strings;

//Task is to Reverse the given string.
public class ReverseString {
    public static String reverseString(String str) {
        int right = str.length() - 1;
        StringBuilder rev = new StringBuilder();
        while (right >= 0) {
            rev.append(str.charAt(right));
            right--;
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String str = "Output";
        System.out.println("Reverse String: " + reverseString(str));
    }
}
