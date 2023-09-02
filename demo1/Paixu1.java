package demo1;

import java.util.Arrays;
import java.util.Collections;

public class Paixu1 {
    public static void main(String[] args) {
        int[] array={5,6,3,2,4};
//        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {

            if(i==array.length-1){
                System.out.println(array[i]);


            }else {
                System.out.print(array[i]+" ");
            }
        }

        System.out.println(Arrays.toString(array));

        System.out.println("==============倒序=============");
        Integer[] arr=new Integer[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.valueOf(array[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
