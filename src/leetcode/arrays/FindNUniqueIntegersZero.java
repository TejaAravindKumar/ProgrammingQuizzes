package leetcode.arrays;

import java.util.Arrays;

public class FindNUniqueIntegersZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(7)));
    }

    private static int[] sumZero(int i) {
        int[] arr = new int[i];
        int a = i/2;
        int b = -a;
        int k = 0;
        for (int j = b; j <= a; j++) {
            if ((i&1) ==0 && j==0){
                continue;
            }
            arr[k] = j;
            k++;
        }
        return arr;

    }

   /* private static int sumZero(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0){
                return i+1;
            }
        }
        return -1;
    }*/
}
