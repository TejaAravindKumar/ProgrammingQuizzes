package AssesmentsPractice.A0208;

import java.util.Arrays;

public class FirstLetterToUppercase {
    public static void main(String[] args) {
        String str = "aaa bbba sss ddd";
        String [] arr = str.split(" ");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(append(arr[i]));
        }
        System.out.println(Arrays.toString(arr));


    }
    public static StringBuilder append(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i==0){
                sb = new StringBuilder(("" + str.charAt(0)).toUpperCase());
            }
            sb.append(str.charAt(i));
        }
        return sb;

    }
}
