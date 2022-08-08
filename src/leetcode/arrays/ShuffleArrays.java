package leetcode.arrays;

import java.util.Arrays;

public class ShuffleArrays {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length/2; i++) {
            num[2*i] = arr[i];
            num[2*i+1] = arr[arr.length/2 +i];

        }
        System.out.println(Arrays.toString(num));


    }
}
