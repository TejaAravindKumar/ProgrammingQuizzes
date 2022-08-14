package leetcode.arrays;

public class DignalSum {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}}));

    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j){
                    sum += mat[i][j];
                }
                if ((mat.length-1-i)==(j) ){
                    sum += mat[i][j];
                }

            }

        }
        if (mat.length%2==0){
            return sum;
        }
        return sum-mat[mat.length/2][mat.length/2];

    }
}
