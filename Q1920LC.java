public class Q1920LC {
    public static int[] name(int[] nums)
    {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
