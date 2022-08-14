package leetcode.arrays;

public class EvenDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));

    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if((noOfDigits(num)&1)==0){
                count++;
            }
        }
        return  count;
    }

    private static int noOfDigits(int num) {
        return (int)Math.log10(num)+1;
    }
}
