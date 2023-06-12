public class Q1470LC {
    public static int[] name(int[] nums, int n)
    {
        int[] ans = new int[2*n];
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i]=nums[n+i];
        }
        int j=0,k=0;
        for (int i = 0; i < 2*n; i+=2) {
            ans[i]=nums[j];
            j+=1;
        }
        for (int i = 1; i < ans.length; i+=2) {
            ans[i]=t[k];k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,3,2,1};
        for (int i : a) {
            System.out.print(i+", ");
        }
        int[] b = name(a, 4);
        System.out.println();
        for (int i : b) {
            System.out.print(i+", ");
        }
    }
}
