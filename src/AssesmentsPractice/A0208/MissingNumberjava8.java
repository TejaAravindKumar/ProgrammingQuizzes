package AssesmentsPractice.A0208;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MissingNumberjava8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i==6||i==8){
                continue;
            }
            list.add(i);
        }
        Collections.sort(list);
        System.out.println("Input list "+list);

        List<Integer> missingList = new ArrayList<>();

        AtomicInteger count = new AtomicInteger(1);
        missingList= list.stream().filter(e-> list.contains(count)).collect(Collectors.toList());
        System.out.println(missingList);





    }
}
