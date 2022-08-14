package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatingRule {
    public static void main(String[] args) {
        List<List<String>> items =  new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        System.out.println(countMatches(items,"type","phone"));


    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        if (ruleKey.equals("color")){
            i = 1;
        }
        if (ruleKey.equals("name")){
            i = 2;
        }
        int count = 0;
        for (int j = 0; j < items.size(); j++) {
            if (items.get(j).get(i).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

}
