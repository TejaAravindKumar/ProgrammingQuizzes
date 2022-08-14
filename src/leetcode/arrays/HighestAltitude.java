package leetcode.arrays;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));

    }
    public static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0] = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            arr[i+1] = gain[i] + arr[i];
            if (max < arr[i+1]){
                max = arr[i+1];
            }
        }
        return max;

    }

}
