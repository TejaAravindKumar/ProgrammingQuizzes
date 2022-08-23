package leetcode.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(reverseSort(arr)));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list = list.stream().filter(e-> (e&1)!=0).collect(Collectors.toList());
        System.out.println(list);

        System.out.println();

    }

    private static int[] reverseSort(int[] arr) {
        int[] nums = new int[arr.length];
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & 1) != 0){
                str.append(arr[i]);
            }
        }
        nums =  reverseArray(str);
        System.out.println(str);
        return  nums;

    }

    private static int[] reverseArray(StringBuilder str) {
        int[] nums = new int[str.length()];
        for (int i = 0 ; i < str.length(); i++) {
            nums[str.length()-1 -i] = Integer.parseInt(""+str.charAt(i));
        }
        return  nums;
    }
}
