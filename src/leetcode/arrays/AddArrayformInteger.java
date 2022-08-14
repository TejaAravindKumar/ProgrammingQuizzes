package leetcode.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddArrayformInteger {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1));

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = num.length-1; i >= 0 || k > 0 ; i--) {
            if (i>=0){
                k += num[i];
            }
            list.add(k%10);
            k/=10;

        }
        Collections.reverse(list);








//        int i = num.length;
//        while(i-- >0 || k>0){
//            if(i>=0){
//                k += num[i];
//            }
//            list.add(k%10);
//            k/=10;
//
//        }
//        Collections.reverse(list);


//        int size = (int)Math.log10(k)+1;
//            for (int i = 0; i < size; i++) {
//                int a = num[num.length - i - 1] + k % 10;
//                while (a > 9) {
//                    int rem = a % 10;
//                    num[num.length - 1 - i] = rem;
//                    num[num.length - 2 - i] += a / 10;
//                    a/=10;
//
//                }
//                {
//                    num[num.length - 1 - i] = a;
//                }
//                k /= 10;
//            }
//            for (int n : num) {
//                list.add(n);
//
//            }



        return list;


//        int size = (int)Math.log10(k)+1;
//        for (int i = 0; i < size ; i++) {
//            num[num.length-i-1] += k%10;
//            k /= 10;
//        }
//        List<Integer> list = new ArrayList<>();
//        for (int i = num.length-1;i>=0;i--) {
//            if(num[i]>9){
//                int rem = num[i]%10;
//                list.add(rem);
//                num[i-1] += num[i]/10;
//
//            }else {
//                list.add(num[i]);
//
//            }
//        }
//        Collections.reverse(list);




//        Long sum = 0L;
//        for (int s :num) {
//            sum = sum*10 + s;
//        }
//        sum += k;
//        System.out.println(sum);
//        String str = sum.toString();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < str.length(); i++) {
//            list.add(Integer.parseInt(str.charAt(i)+""));
//        }

//        Long rev =0L;
//        while (sum>0){
//            Long rem = sum%10;
//            rev = rev * 10 + rem;
//            sum /= 10;
//        }
//        while (rev>0){
//            int rem = (int) (rev%10);
//            list.add(rem);
//            rev /= 10;
//
//        }

    }

}
