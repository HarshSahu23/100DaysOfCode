import java.util.*;
import Helpers.*;
public class Q2367LC
{
    public static int arithmeticTriplets(int[] nums, int diff){
        int uniqueTriplets=0;
        Set<Integer> visited = new HashSet<>();
        for (int number : nums) {
            boolean hasDiff1 = visited.contains(number-diff);
            boolean hasDiff2 = visited.contains(number-diff*2);
            if (hasDiff1&&hasDiff2) {
                uniqueTriplets+=1;
            }       
            visited.add(number);
        }
        return uniqueTriplets;
    }
    public static void main(String[] args)
    {
        System.out.println();
        int[] test = {0,1,4,6,7,10};

        // int[] test = GenerateMatrix.generateLinearMatrix(10, false, 10);
        // Arrays.sort(test);
        // PrintMatrix.printMatrixLinear(test);

        int ans = arithmeticTriplets(test, 3);
        System.out.println("ans = "+ans);
    }
}