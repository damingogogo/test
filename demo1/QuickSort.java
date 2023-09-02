package demo1;

public class QuickSort {

    //快速排序
    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 3, 6, 4, 7, 9, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (arr[j] >= base && i < j) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }
            //i停下，j停下
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //i和j相遇，交换基准数和相遇位置的元素
        arr[left] = arr[i];
        arr[i] = base;
        quickSort(arr, left, i - 1);
        quickSort(arr, j + 1, right);


    }
}
