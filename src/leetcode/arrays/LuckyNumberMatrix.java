package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{7,8},{1,2}}));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int j = 0;
            int min = matrix[i][j];
            int index = j;
            for (; j < matrix[i].length; j++) {
                if ( min > matrix[i][j]){
                    min = matrix[i][j];
                    index = j;
                }
            }
            int k = 0;
            int max = matrix[k][index];
            for (; k < matrix.length; k++) {
                if (max < matrix[k][index]){
                    max = matrix[k][index];
                }
            }
            if (max == min){
                list.add(min);
            }
        }
        return  list;


    }

}
