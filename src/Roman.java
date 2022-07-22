import java.util.Scanner;

public class Roman {
    static int[] arabicNumbers = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] romanNumbers = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String toRoman(int number) {

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arabicNumbers.length; i += 1) {
            while (number >= arabicNumbers[i]) {
                number -= arabicNumbers[i];
                res.append(romanNumbers[i]);
            }
        }
        return res.toString();
    }

    public static int toArab(String number) {
        int result = 0;
        int[] arabNumbers = {10, 9, 5, 4, 1};
        String[] romanNumbers = {"X", "IX", "V", "IV", "I"};
        for (int i = 0; i < arabNumbers.length; i++) {
            while (number.indexOf(romanNumbers[i]) == 0) {
                result += arabNumbers[i];
                number = number.substring(romanNumbers[i].length());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(toArab("III"));
    }

    public static boolean isValidRoman(String number) {
        boolean isValid = false;
        String[] validRoman = new String[]{"X", "IX", "VIII", "VII", "VI", "V", "IV","III", "II","I"};



        for (String rom : validRoman) {
            if (number.equals(rom)) {
                isValid = true;
            }
        }
        return isValid;
    }
}