package demo1.likou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Stram1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三-15", "lis-15", "sj-16", "sdh-18", "hdjshd-15", "scjbsdc-14");


        //第一个类型: 流中原本的数据类型
        // 第二个类型:要转成之后的类型
        //apply的形参s: 依次表示流里面的每一个数据
        // 返回值: 表示转换之后的数据
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                String s1 = arr[0];
//                String s2 = arr[1];
//                int age = Integer.parseInt(s2);
//                return age;
//            }
//        }).forEach(s-> System.out.println(s));

        list.stream().map(s -> Integer.valueOf(s.split("-")[1])).forEach(s -> System.out.println(s));
    }
}
