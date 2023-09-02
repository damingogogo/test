package demo1.likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YiChuyuanshu {
    /*
        输入：nums = [3,2,2,3], val = 3
        输出：2, nums = [2,2]

        输入：nums = [0,1,2,2,3,0,4,2], val = 2
        输出：5, nums = [0,1,4,0,3]

     */
    public static void main(String[] args) {

//        int[] array=new int[]{1,5,3,3,2,3,3,3,4,3};
//        int val=3;
//        List<Integer> arrayList = new ArrayList<>();
//        for (int num : array) {
//            arrayList.add(num);
//        }
//        System.out.println(arrayList);
//        System.out.println("===========");
//        int count=0;
//        int yuan=arrayList.size();
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(val==arrayList.get(i)){
//                count++;
//                arrayList.remove(i);
//                i--;
//            }
//        }
//
//        System.out.println(arrayList);
//        System.out.println(yuan-count);

//        removeElement(new int[]{1,3,2,3}, 3);

        int[] array=new int[]{0,1,2,2,3,0,4,2};
        int val=2;
        int i = removeElement(array, val);
        int[] ints = removeElement1(array, val);
        System.out.println(i);
        for (int i1 = 0; i1 < ints.length; i1++) {
            System.out.print(ints[i1]+" ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(num);
        }

                int count=0;
        int yuan=arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            if(val==arrayList.get(i)){
                count++;
                arrayList.remove(i);
                i--;
            }
        }
        return yuan-count;

    }

    public static int[] removeElement1(int[] nums, int val) {
        List<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(num);
        }

        int count=0;
        int yuan=arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            if(val==arrayList.get(i)){
                count++;
                arrayList.remove(i);
                i--;
            }
        }
       int[] arr=new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i]=arrayList.get(i);
        }
        return arr;

    }
}
