import java.util.*;
public class Q1389LC
{
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetArray = new ArrayList<Integer>();
        for (int i = 0; i < index.length; i++) {
            targetArray.add(index[i],nums[i]);
        }
        int[] a = new int[targetArray.size()];
        for (int i = 0; i < a.length; i++) {
            a[i]=targetArray.get(i);
        }
        return a;
    }
    
}