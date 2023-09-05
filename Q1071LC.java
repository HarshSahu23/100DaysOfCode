public class Q1071LC {
    public static String gcdOfStrings(String str1, String str2) {
        int gcdLen = gcdNum(str1.length(), str2.length());
        if (str1.length()==str2.length()) {
            if (str1.equals(str2)) {
                return str2;
            }
            else{
                return "";
            }
        }
        else{
            StringBuilder checkStr1 = new StringBuilder("");
            StringBuilder checkStr2 = new StringBuilder("");
            StringBuilder y = str1.length()>str2.length()? new StringBuilder(str2.substring(0, gcdLen)):new StringBuilder(str1.substring(0, gcdLen));

            for (int i = 1; i <= str1.length()/gcdLen; i++) {
                checkStr1.append(y);
            }
            for (int i = 1; i <= str2.length()/gcdLen; i++) {
                checkStr2.append(y);
            }
            if ((str1.equals(checkStr1.toString()))&&(str2.equals(checkStr2.toString()))) {
                return y.toString();
            }
            else{
                return "";
            }
            
        }
    }
    public static int gcdNum(int a, int b){
        if (b==0) {
            return a;
        }
        return gcdNum(b,a%b);
    }
    public static void main(String[] args) {
        String ans = gcdOfStrings("ABCABC", "ABC");
        System.out.println(ans);
    }
}
