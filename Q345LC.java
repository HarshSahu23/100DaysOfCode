import java.util.HashSet;

public class Q345LC {
    public static String reverseVowels(String s) {
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('A');vowel.add('E');vowel.add('I');vowel.add('O');vowel.add('U');
        vowel.add('a');vowel.add('e');vowel.add('i');vowel.add('o');vowel.add('u');
        char[] word = s.toCharArray();
        int j=word.length-1;
        for (int i = 0; i < word.length; i++) {
            if (vowel.contains(word[i])) {
                while (!vowel.contains(word[j])) {
                    j--;
                }
                if ((i!=j)&&(i<j)) {
                    char temp = word[i];
                    word[i]=word[j];
                    word[j]=temp;
                    j--;
                }
                else{
                    break;
                }
            }
        }
        return new String(word);
    }
    public static void main(String[] args) {
        String test = "A quick Brown sly fox jUmped";
        String ans = reverseVowels(test);
        System.out.println(test);
        System.out.println(ans);
    }
}
