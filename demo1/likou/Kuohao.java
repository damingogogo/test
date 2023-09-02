package demo1.likou;

import java.util.Arrays;

public class Kuohao {
    //    (40    )41
    public static void main(String[] args) {
//        String aa = "ssss";
//        char[] chars = aa.toCharArray();
//        int aaa = (int) chars[0];
//        System.out.println(chars);
//        System.out.println(aaa);
        boolean valid = isValid("(){}}{");
        System.out.println(valid);

    }

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == 40 && chars[i + 1] == 41) || (chars[i] == 123 && chars[i + 1] == 125) || (chars[i] == 91 && chars[i + 1] == 93)) {
                return true;
            }

        }
        return false;
    }
}
