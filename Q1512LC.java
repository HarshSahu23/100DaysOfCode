import java.util.*;

public class Q1512LC {
    public static int goodPairs(int[] nums)
    {
        int numOfGoodPairs=0;
        Map<Integer,Integer> occurence = new HashMap<Integer,Integer>();
        for (int i : nums) {
            if (occurence.containsKey(i)) {
                occurence.put(i, occurence.get(i)+1);
            }
            else{
                occurence.put(i, 1);
            }
        }
        Iterator i = occurence.entrySet().iterator();
        
        while (i.hasNext()) {
            Map.Entry mapElement = (Map.Entry)i.next();
            int n=(int)mapElement.getValue();
            numOfGoodPairs+=(n*(n-1)*0.5);
            
        }
        return numOfGoodPairs;
    }
    public static void main(String[] args) {
        int[] test = {1,2,3,1,1,3};
        System.out.println(goodPairs(test));
    }
}
