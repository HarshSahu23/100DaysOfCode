import java.util.List;

public class Q2828LC {
    public static boolean isAcronym(List<String> words, String s) {
        if (words.size()!=s.length()) {
            return false;
        }
        else{
            boolean isAcr = true;
            for (int i = 0; i < words.size(); i++) {
                int x=s.charAt(i)-'0';
                int y=words.get(i).charAt(0)-'0';
                if (x!=y) {
                    return false;
                }
            }
            return isAcr;
        }
       
    }
    public static void main(String[] args) {
        
    }
}
