public class Q1365LC {
    public static int[] smallerNumbersThanCurrent(int[] nums)
    {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            int val = nums[i];
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if (nums[j]<val) {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
