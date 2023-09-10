public class Q151LC {
    // public static void abc(String sentence){
    //     sentence=sentence.trim();
    //     StringBuilder s = new StringBuilder(sentence);
    //     int countSpace=0;
    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i)==' ') {countSpace++;}
    //         if (s.charAt(i)!=' ') {
    //             countSpace=0;
    //         }
    //         if (countSpace>1) {
    //             s.deleteCharAt(i);i--;
    //         }
    //     }
    //     int j=0;
    //     int i;
    //     String temp="";
    //     String ans="";
    //     for (i = 0; i < s.length(); i++) {
    //         while ((j<s.length())&&(s.charAt(j)!=' ')) {
    //             temp +=s.charAt(j)+"";j++;
    //         }
    //         ans=temp+" "+ans;
    //         i=j;j++;temp="";
    //     }
    //     // System.out.println(ans.trim()+".");
    // }
    public static String abc(String s){
        
        s=s.trim();
        StringBuilder ans = new StringBuilder(s);
        int j=0;int i;
        String temp="";
        // String ans="";
        for (i = 0; i < s.length(); i++) {
            while ((i<s.length())&&(s.charAt(i)==' ')) {
                i++;
            }
            if (i==s.length())  break;
            j=i;

            while ((j<s.length())&&(s.charAt(j)!=' ')) {
                temp+=s.charAt(j)+"";
                j++;
            }
            ans.insert(0,s.substring(i, j)+" ");
            // ans=temp+" "+ans;
            // temp="";
            i=j;
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        String test = "A test  of     s ";
        System.out.println(test+".");
        abc(test);
    }
}
