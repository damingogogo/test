package demo1.likou;

import java.util.Arrays;

public class Liangshuhe {
    //两数和有bug
    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 9, 11};
        int target = 18;
        int[] s = getS(arr, target);
        System.out.println(Arrays.toString(s));
    }

    public static int[] getS(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("没找到");
    }

}
