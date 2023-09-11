public class Q443LC {
    public static int compress(char[] chars) {
        int i=0,j=0,k=0;
        int count=0;
        int n=chars.length;
        while (j<n) {
            chars[i]=chars[j];
            while ((k<n)&&chars[k]==chars[j]) {
                count++;k++;
            }
            // System.out.println("count = "+count);
            if (count>1) {
                // // chars[i]=chars[j];
                // int jump=0;
                // while(count>0){
                //     chars[i+1]=(char)((count%10)+'0');
                //     jump+=1;
                //     count/=10;
                //     i++;
                // }
                // // chars[i+1]=(char)(count+'0');
                // i=i+jump;

                char[] digits = String.valueOf(count).toCharArray();
                for (char c : digits) {
                    chars[i+1]=c;
                    i++;
                }
                i++;
            }
            else{
                // chars[i]=chars[j];
                i++;
            }
            j=k;count=0;
        }
        // System.out.println("i = "+i);
        // System.out.println("i-1 = "+(i-1));
        return i-1;
    }
    public static void main(String[] args) {
        String test = "a";
        // char[] ans = compress(test.toCharArray());
        // System.out.println();
        // System.out.println(((char)1));
        // for (char c : ans) {
        //     System.out.print(c+" ");
        // }
    }
}
