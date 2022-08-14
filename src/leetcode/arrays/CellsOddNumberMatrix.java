package leetcode.arrays;

import java.util.Arrays;

public class CellsOddNumberMatrix {
    public static void main(String[] args) {
        System.out.println(oddCells(2,3, new int[][]{{0,1},{1,1}}));

    }
    public static int oddCells(int m, int n, int[][] indices) {
        System.out.println(indices.length);
            int[][] arr = new int[m][n];
            for (int i = 0; i < indices.length; i++) {
                int row = indices[i][0];
                int col = indices[i][1];
                for (int j = 0; j < n; j++) {
                    arr[row][j]++;
                }
                for (int j = 0; j < m; j++) {
                    arr[j][col]++;
                }

            }




//        int a = indices[0][0];
//        int b = indices[1][0];
//        int c = indices[1][1];
//        int d = indices[0][1];

       /* for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                int a = indices[i][j];
                for (int k = 0; k < m; k++) {
                    for (int l = 0; l < n; l++) {
                        if (a == k && (i%2==0 && j%2==0)){
                            arr[k][l] = arr[k][l] + 1;
                        }
                        if (a == l && (i%2!=0 &&  j%2==0)){
                            arr[k][l] = arr[k][l] + 1;
                        }
                        if (a == k && (i%2==0 &&  j%2!=0)){
                            arr[k][l] = arr[k][l] + 1;
                        }
                        if (a == l && (i%2!=0 &&  j%2!=0)){
                            arr[k][l] = arr[k][l] + 1;
                        }

                    }
                }


            }

        }*/


//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (a == i){
//                    arr[i][j] = arr[i][j] + 1;
//                }
//                if (b == j){
//                    arr[i][j] = arr[i][j] + 1;
//                }
//                if (c == i){
//                    arr[i][j] = arr[i][j] + 1;
//                }
//                if (d == j){
//                    arr[i][j] = arr[i][j] + 1;
//                }
//            }
//        }
        int count = 0;
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
            for (int s : num) {
                if (s%2 == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
