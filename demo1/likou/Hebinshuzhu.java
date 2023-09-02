package demo1.likou;

import java.util.*;

public class Hebinshuzhu {
    public static void main(String[] args) {
        Integer[] integerArray1=merge(new int[]{1,2,3,4,5,6}, 3, new int[]{7,8,9}, 3);
        for (int i = 0; i < integerArray1.length; i++) {
            System.out.print(integerArray1[i]+" ");
        }
    }

    public static Integer[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ints1 = Arrays.copyOf(nums1, m);
        int[] ints2 = Arrays.copyOf(nums2, n);
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < ints1.length; i++) {
            list.add(ints1[i]);
        }
        for (int i = 0; i < ints2.length; i++) {
            list.add(ints2[i]);
        }


        Integer[] integerArray = list.toArray(new Integer[0]);
         Arrays.sort(integerArray);
        return integerArray;
    }
}
