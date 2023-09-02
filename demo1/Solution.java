package demo1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    //给定一个整数数组nums 和一个整数目标值 target，请你在该数组中找出和为目标值 target的那两个整数并返回它们的数组下标。
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 13};
        int target = 9;
        int[] aaa = twoSum(arr, target);
        System.out.println(Arrays.toString(aaa));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }

}

