package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Aaa {
    public static void main(String[] args) {
        int[] aaa = {1, 2, 3,4};
//        int[] numAdd = getNumAdd(aaa);
//        System.out.println(Arrays.toString(numAdd));

        int[] numAdd = getNumAdd(aaa);

        System.out.println(Arrays.toString(numAdd));
    }

    public static int[] getNumAdd(int[] nums) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            sum = sum + arr[i];
//            arrayList.add(sum);
//        }
//        int[] bbb = new int[arrayList.size()];
//        for (int i = 0; i < arrayList.size(); i++) {
//               bbb[i]=arrayList.get(i);
//        }
//        return bbb;


        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
            System.out.print(nums[i]+" ");
        }
        return nums;
    }


}
