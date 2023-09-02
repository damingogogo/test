package demo1;


import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //冒泡排序
       int[] arr={5,6,3,2,4};
        for (int i = 0; i < arr.length; i++) {
            //       比较次数
            //i=0    4
            //i=1    3
            //i=2    2
            //i=3    1
            //i=4    0
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }

            }

        }
        System.out.println(Arrays.toString(arr));


    }
}
