import java.util.*;
public class test121
{
    public static int abc(int[] prices){
        HashSet<Integer> uniqChar = new HashSet<>();
        int maxProfit=0;
        int L=0,R=1;
        while(R<prices.length){
            if(prices[L]<prices[R]){
                int currentProfit=prices[R]-prices[L];
                maxProfit=Math.max(currentProfit,maxProfit);
            }
            else{
                L=R;
            }
            R++;
        }
        return maxProfit;

    }
    public static void main(String[] args)
    {
        System.out.println("succi");

    }

}