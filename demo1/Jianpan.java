package demo1;

import java.util.Scanner;

import static org.apache.coyote.http11.Constants.a;

public class Jianpan {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+"*"+i+" ");
            }
            System.out.println();
        }
    }
}
