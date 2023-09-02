package demo1.likou;

import java.util.Arrays;
import java.util.Collections;

public class Dkkk {
    public static void main(String[] args) {
        //冒泡排序
//     int[] arr={0,1,5,6,3,8};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp=0;
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//
//
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));


        //选择排序
        int[] arr={9,8,7,6,5,4,3,99,2,1};
        //i=0                 j=1,2,3
        //i=1                 j=2,3
        //i=2                 j=3
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int t=0;
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;

                }
            }

        }
        System.out.println(Arrays.toString(arr));

//        System.out.println((Integer) Collections.reverseOrder(arr));
    }
}
