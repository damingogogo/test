package demo1;

public class Erfen {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int search = search(arr, target);
        System.out.println(search);
    }

//    public static int search(int[] nums, int target) {
//
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                count = i;
//
//                return count;
//            }
//
//        }
//        return count = -1;
//    }


    //二分法查找元素，找到返回下标，未找到返回-1
    /*
    public static int search(int[] nums, int target) {
        int len = nums.length;

        int left = 0;
        int right = len - 1;
        // 目标元素可能存在在区间 [left, right]
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // 下一轮搜索区间是 [mid + 1, right]
                left = mid + 1;
            } else {
                // 下一轮搜索区间是 [left, mid]
                right = mid;
            }
        }

        if (nums[right] == target) {
            return right;
        }
        return -1;
    }

    */


    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }
}
