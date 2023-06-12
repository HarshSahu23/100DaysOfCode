import java.util.ArrayList;
import java.util.List;

public class Q1431LC
{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> L = new ArrayList<Boolean>();
        int max=candies[0];
        for (int i  : candies) {
            if (i>max) {
                max=i;
            }
        }
        for (int i : candies) {
            if (i+extraCandies>=max) {
                L.add(true);
            }
            else{
                L.add(false);
            }
        }
        return L;

    }
    public static void main(String[] args)
    {
        int[] c = {12,1,12};
        List<Boolean> L = kidsWithCandies(c, 10);
        System.out.println();
        for (Boolean boolean1 : L) {
            System.out.print(boolean1+", ");
        }
    }
}