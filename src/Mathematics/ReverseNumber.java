package Mathematics;

//Find Reverse of the Given Number.
public class ReverseNumber {
    public static int reverseNum(int num) {
        int res = 0;
        while (num > 0) {
            res = res * 10 + (num % 10);
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 1231;
        System.out.println("Reverse of a Given Number:- " + reverseNum(num));
    }
}
