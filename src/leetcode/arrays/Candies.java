package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int num : candies ) {
            if(max < num){
                max = num;
            }
        }
        for (int num : candies) {
            if (max <= num + extraCandies){
                list.add(true);
            }else {
                list.add(false);
            }

        }
       return list;
    }
}
