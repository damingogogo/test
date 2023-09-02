package demo1;

public class Arry {
    /*
        遍历数组
     */
    public static void main(String[] args) {
        int[] arry1 = {11, 22, 33, 44, 55};
        int[] arry11 = arry1;
        printArr(arry11);


        int[] arrr2 = {1, 5, 9, 5, 4, 55};
        int max = getMax(arrr2);
        System.out.println("数组最大值是：" + max);

    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);

            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");

    }




    /*
    求数组中的最大值
     */

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }
}
