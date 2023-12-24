package Mathematics;

import static Mathematics.CountDigits.countDigits;

/*  Task is to find whether a given number is a fascinating number or not. Eg.- 327,192
        A number (n) may be a fascinating number if it satisfies the following two conditions:
            1) If the given number is a 3 or more than three-digit,
                then multiply the given number with 2 and 3 separately and concatenate the three numbers
            2)If the value getting after concatenation contains all digits from 1 to 9, exactly once. */
public class FascinatingNumber {
    public static boolean isFascinatingNumber(int num) {
        int count_digits = countDigits(num);
        if (count_digits < 3) {
            return false;
        } else {
            int resWith2 = num * 2;
            int resWith3 = num * 3;

            String numStr = Integer.toString(num);
            String resWith2Str = Integer.toString(resWith2);
            String resWith3Str = Integer.toString(resWith3);

            numStr = numStr.concat(resWith2Str);
            numStr = numStr.concat(resWith3Str);

            for (int i = 0; i < numStr.length(); i++) {
                for (int j = i + 1; j < numStr.length(); j++) {
                    if (numStr.charAt(i) == numStr.charAt(j)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int num = 324;
        if (isFascinatingNumber(num)) {
            System.out.println("Is a Fascinating Number.");
        } else {
            System.out.println("Is not a Fascinating Number.");
        }
    }
}
