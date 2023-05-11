public class Q122LC_alt {
    public static int profit(int[] prices){
        
        int currentProfit=0; int newProfit=0;
        int startPrice = prices[0]; 
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<startPrice) {
                startPrice=prices[i];
            }
            newProfit=prices[i]-startPrice;
            if (newProfit>0) {
                currentProfit+=newProfit;
                startPrice=prices[i];
            }
            if((newProfit<currentProfit)&&(prices[i]<startPrice)){
                startPrice=prices[i];
            }
        }
        return currentProfit;
    }
    public static void main(String[] args) {
        int[] p = {7,1,5,3,6,4};
        // int[] p = {7,6,4,3,1};
        System.out.println(profit(p));
    }
}
