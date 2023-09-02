package demo1;

import java.util.Random;

public class StringCodeGenerate {


    /**
     * 生成指定位数的验证码
     * @param args
     */
    public static void main(String[] args) {


        String s = codeGenerate(5);
        System.out.println(s);

    }


    public static String codeGenerate(int n) {

        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
