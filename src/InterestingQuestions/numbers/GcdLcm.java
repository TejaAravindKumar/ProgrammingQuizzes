package InterestingQuestions.numbers;

public class GcdLcm {
    public static void main(String[] args) {

        int num1 = 36;
        int num2 = 24;
        int a = num1;
        int b = num2;
        int ans = 0;
        while(a % b > 0){
            ans = a % b;
            b = a;
            a = ans;
        }
        int lcm = (num1*num2)/b;
        System.out.println("GCD = "+b);
        System.out.println("LCM = "+lcm);
    }
}
