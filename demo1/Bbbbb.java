package demo1;

import java.util.ArrayList;
import java.util.List;

public class Bbbbb {
    public static void main(String[] args) {
        List<String> stringList = fizzBuzz(15);
        System.out.println(stringList);
    }


//    给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
//
//    answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
//    answer[i] == "Fizz" 如果 i 是 3 的倍数。
//    answer[i] == "Buzz" 如果 i 是 5 的倍数。
//    answer[i] == i （以字符串形式）如果上述条件全不满足。


    public static List<String> fizzBuzz(int n) {
        List<String> arr=new ArrayList<>();
        for (int i = 1; i < n+1; i++) {

            if(i%5==0&&i%3==0){
                arr.add("FizzBuzz");
            }else if(i%5==0){
                arr.add("Buzz");
            }else if(i%3==0){
                arr.add("Fizz");
            }else {
                arr.add(String.valueOf(i));
            }
        }


           return arr;
    }
}
