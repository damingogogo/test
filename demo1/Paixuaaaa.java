package demo1;

import java.util.Arrays;
import java.util.Collections;

public class Paixuaaaa {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 3, 2, 9};
        Arrays.sort(array);
        System.out.println("==============倒序=============");
        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(array[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
