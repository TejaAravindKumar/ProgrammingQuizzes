package leetcode.arrays;

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));


    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int extraZero = 0;
        for (int i = 0; i < target.length; i++) {
            if(target[index[i]]!=0 || extraZero>0) {
                int count = index[i] +1;
                for (int j = target.length-1; j > count-1; j--) {
                    target[j] = target[j-1];

                }
                target[index[i]] = nums[i];
            }else {
                target[index[i]] = nums[i];
                extraZero++;

            }

        }
        return target;


    }
}
