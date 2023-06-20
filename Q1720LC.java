public class Q1720LC {
    public static int[] decode(int[] encoded, int first)
    {
        int[] ans = new int[encoded.length+1];
        ans[0]=first;
        for (int i = 1; i < ans.length; i++) {
            first=ans[i-1];
            ans[i]=encoded[i-1]^first;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int[] decode = decode(encoded, 4);
        for (int i : decode) {
            System.out.print(i+", ");
        }
    }
}
