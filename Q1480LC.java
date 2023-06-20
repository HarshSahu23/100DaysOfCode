public class Q1480LC {
    public static  int[] runningSum(int[] nums)
    {
        int[] rs = new int[nums.length];int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            rs[i]=sum;
        }
        return rs;
    }
    public static void main(String[] args) {
        
    }
}
