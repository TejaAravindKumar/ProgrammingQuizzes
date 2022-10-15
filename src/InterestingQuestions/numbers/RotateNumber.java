package InterestingQuestions.numbers;

public class RotateNumber {
    public static void main(String[] args) {
        int num = 51234;
        int k = 7;
        int digits = (int)Math.log10(num) + 1;
         k = k%digits;
        if (k<0){
            k = k +digits;
        }
        int ans = 0;
        while(k>0){
            int rem = num % 10;
            ans = rem * (int)Math.pow(10,digits-1);
            num /= 10;
            ans += num;
            k--;
            num = ans;
        }
        System.out.println(ans);
    }
}
