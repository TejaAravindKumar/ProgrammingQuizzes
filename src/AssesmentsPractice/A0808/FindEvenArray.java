package AssesmentsPractice.A0808;

import java.util.Arrays;

public class FindEvenArray {
    public static void main(String[] args) {
        int [] arr = {100,1,222,323,342,45,4478};
        /*for (int num : arr) {
            if ((num > 100) && (num & 1)==0){
                System.out.println(num);
            }

        }*/
        Arrays.stream(arr).forEach(e->{
            if (e > 100 && (e & 1) == 0){
                System.out.println(e);
            }
        });

    }

}
