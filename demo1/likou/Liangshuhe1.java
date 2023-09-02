package demo1.likou;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Liangshuhe1 {
    //两数之和
    public static void main(String[] args) {
        int[] sum = getSum(new int[]{2, 7, 9, 14}, 9);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] getSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(nums[0], 0);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};

            } else {
                hashMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("没找到");
    }
}
