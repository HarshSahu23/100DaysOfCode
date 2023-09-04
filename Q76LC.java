import java.util.*;
public class Q76LC {
    public static String minWindow(String s, String t) {

        if (s=="") {
            return "";
        }

        int[] result = {-1,-1};int resultLen = Integer.MAX_VALUE;
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        for (char c : t.toCharArray()) {
            countT.put(c,countT.getOrDefault(c,0)+1);
        }

        int have=0,need=countT.size();
        char charR;char charL;
        int L=0;int R;
        for (R = 0; R < s.length(); R++) {
            charR=s.charAt(R);
            window.put(charR,window.getOrDefault(charR,0)+1);
            if (countT.containsKey(charR)&&(window.get(charR).equals(countT.get(charR)))) {
                have+=1;
            }
            while (have==need) {
                //update size
                charL = s.charAt(L);
                if ((R-L+1)<resultLen) {
                    result[0]=L;result[1]=R;
                    resultLen=R-L+1;
                } 
                //update count of character @ L
                window.put(charL,window.get(charL)-1);
                if ((countT.containsKey(charL))&&(window.get(charL)<countT.get(charL))) {
                            have-=1;
                }
                //move L
                L++;
            }
        }
        L=result[0];
        R=result[1];
        String ans="";
        for (int i = L; i < R+1; i++) {
            ans+=Character.toString(s.charAt(i));
        }
        if (resultLen!=Integer.MAX_VALUE) {
            return ans;
        }
        else{
            return "";
        }
    }
}
