package demo1;

import java.util.Arrays;
import java.util.Collections;

public class Paixu {
    public static void main(String[] args) {
        //升序排列
        //冒泡排序
//        int[] arr = {5, 6, 1, 3, 2};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp;
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//
//
//    }






                int[] array = {5, 2, 9, 1, 5, 6};

                System.out.println("原始数组：");
                printArray(array);

                Arrays.sort(array);
                System.out.println("排序后的数组：");
                printArray(array);

              System.out.println("倒序后的数组：");
                printArray1(array);
            }

            // 打印数组元素
            public static void printArray(int[] arr) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }



    public static void printArray1(int[] array) {
        Integer[] integerArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            //将int型数组转化为Integer型数组
            integerArray[i] = Integer.valueOf(array[i]);
        }


        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(integerArray));
    }

}