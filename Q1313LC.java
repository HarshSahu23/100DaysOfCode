import java.util.ArrayList;

public class Q1313LC {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> RLE = new ArrayList<Integer>();
        for (int i = 0; i <= (nums.length)/2; i++) {
            int count = nums[2*i];
            while (count>0) {
                RLE.add(nums[(2*i)+1]);
                count--;
            }
        }
        int[] ans = new int[RLE.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=RLE.get(i);
        }
        return ans;
    }
}
