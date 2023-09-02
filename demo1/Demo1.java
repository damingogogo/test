package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        int[][] abc={{1,2,3,4},{3,2,1,9}};

        System.out.println(maximumWealth(abc));
    }

    public static int maximumWealth(int[][] accounts) {
        List<Integer> arr=new ArrayList<>();
       // int height = twoDArray.length;     获取二维数组的高度（行数）
       // int width = twoDArray[0].length;    获取二维数组的宽度（列数）

        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum=sum+accounts[i][j];
                arr.add(sum);
            }
        }

        Object[] aaa = arr.toArray();
        Arrays.sort(aaa);
        return (int) aaa[aaa.length-1];
    }
}
