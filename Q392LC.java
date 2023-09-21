public class Q392LC
{
    public static boolean isSubsequence(String s, String t) {
        int i = 0 ; int n = s.length();
        if (s.equals(t)) {
            return true;
        }
        else{
            for (int j = 0; j < t.length(); j++) {
                if (i==n) {
                    return true;
                }
                else{
                    if (t.charAt(j)==s.charAt(i)) {
                        i++;
                    }
                }
            }
            return i==n;
        }
    }
    public static void main(String[] args)
    {
        boolean ans = isSubsequence("abc","ajfklsajdfio;ajsdklfbfjdlksajfl;asdfjdsljfjld;akjfla;sdjfkls;adjfc");
        System.out.println(ans);
    }
}