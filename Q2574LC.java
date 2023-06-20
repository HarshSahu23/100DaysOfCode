public class Q2574LC {
    public static  int[] leftRightDifference(int[] nums)
    {
        int size = nums.length;
        //getting left sum
        int[] LS = new int[size];
        int sum=0;
        for (int i = 0; i < LS.length; i++) {
            LS[i]=sum;
            sum+=nums[i];
        }

        //getting right sum 
        int[] RS = new int[size];
        for (int i = 0; i < LS.length; i++) {
            RS[i]=sum-nums[i];
            sum=sum-nums[i];
        }

        //getting answer
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i]=Math.abs(LS[i]-RS[i]);
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
