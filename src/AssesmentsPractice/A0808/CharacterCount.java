package AssesmentsPractice.A0808;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CharacterCount {
    public static void main(String[] args) {
        IntStream chars = "dazz treees hi".chars();
        Map<Character,Integer> map = new HashMap<>();
        chars.forEach(e->{
            if (!map.containsKey((char)e)) {
                map.put((char)e,1);
            }
            map.put((char) e, map.get((char) e) + 1);
        });
        System.out.println(map);

    }
}
