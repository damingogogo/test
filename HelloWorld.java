
public class HelloWorld {
    public static void main(String[] args) {


        /*
        输出逆序数
         */
        int x = 1234;
        int num = 0;
        while (x != 0) {

            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;

        }

        System.out.println(num);
    }
}