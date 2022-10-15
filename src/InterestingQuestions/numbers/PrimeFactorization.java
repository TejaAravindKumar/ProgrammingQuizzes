package InterestingQuestions.numbers;

public class PrimeFactorization {
    public static void main(String[] args) {
        int num = 36;
        for (int i = 2; i * i <= num ; i++) {
            while (num % i == 0){
                num = num / i;
                System.out.print(i+ " ");
            }
        }
        if (num != 0){
            System.out.println(num);
        }
    }
}
