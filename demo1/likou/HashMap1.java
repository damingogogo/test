package demo1.likou;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HashMap1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


//        System.out.println(list);
      list.forEach(s->{
          System.out.print(s+" ");
      });
    }
}
