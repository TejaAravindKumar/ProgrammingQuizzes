package leetcode.arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        transpose(arr);



    }

    public static void transpose(int[][] matrix) {
        for (int[] s : matrix) {
            System.out.println(Arrays.toString(s));

        }
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[i][j] = matrix[j][i];

            }

        }
        for (int[] s : ans) {
            System.out.println(Arrays.toString(s));

        }


    }

}

