package leetcode.arrays;

public class Panagram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));

    }
    public static boolean checkIfPangram(String sentence) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int count = 0;
        for (String s : alphabet) {
            if (sentence.toLowerCase().contains(s)){
                count++;
            }
        }
        return count==26;

    }
}
