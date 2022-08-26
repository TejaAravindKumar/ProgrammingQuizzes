package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4}};
        int[][] nums = matrixReshape(matrix,2,2);
        for (int[] arr :nums) {
            System.out.println(Arrays.toString(arr));
        }

    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] nums = new int[r][c];
        int m =  mat.length;
        int n = mat[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        if (m*n == r*c){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    arr.add(mat[i][j]);
                }
            }

            int count = 0;
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    nums[j][k] = arr.get(count);
                    count++;
                }
            }
            return nums;
        }
        return mat;
    }
}
