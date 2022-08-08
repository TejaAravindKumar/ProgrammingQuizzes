package AssesmentsPractice.A0808;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CharacterCount {
    public static void main(String[] args) {
        IntStream chars = "dazzlings treees hi".chars();
        Map<Character,Integer> map = new HashMap<>();
        chars.forEach(e->{
            int count = 0;
            if (!map.containsKey((char)e)) {
                map.put((char)e,count++);
            }
            map.put((char) e, map.get((char) e) + 1);
        });
        System.out.println(map);

    }
}
