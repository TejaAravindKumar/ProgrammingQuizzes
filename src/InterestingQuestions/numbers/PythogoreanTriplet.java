package InterestingQuestions.numbers;

public class PythogoreanTriplet {
    public static void main(String[] args) {
        int a = 40;
        int b = 41;
        int c = 9;
        if (a*a == (b*b +c*c)){
            System.out.println("Pythogorean triplet");
        } else if (b*b == (a*a +c*c) ) {
            System.out.println("Pythogorean triplet");
        }else if (c*c == (a*a +b*b) ) {
            System.out.println("Pythogorean triplet");
        }else {
            System.out.println("Not Pythogorean triplet");
        }

    }
}
