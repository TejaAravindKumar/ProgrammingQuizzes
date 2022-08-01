package AssesmentsPractice.A0108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {

            if (i==6|| i==9){
                continue;
            }
            list.add(i);
        }
        ArrayList<Integer> missingList = new ArrayList<>();

        Collections.sort(list);
        System.out.println("Input list "+list);

        for (int i = 1; i < list.get(list.size()-1); i++) {
            if (!list.contains(i)){
                missingList.add(i);
            }
        }
        System.out.println(missingList);

    }

}
