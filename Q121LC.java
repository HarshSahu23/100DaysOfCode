public class Q121LC {
    public static int profit(int[] prices){
        int currentProfit=0; int newProfit=0;
        int startPrice = prices[0]; 
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<startPrice) {
                startPrice=prices[i];
            }
            currentProfit=prices[i]-startPrice;
            if (currentProfit>newProfit) {
                newProfit=currentProfit;
            }
        }
        return newProfit;
    }
    public static void main(String[] args) {
        int[] p = {7,1,5,3,6,4};
        // int[] p = {7,6,4,3,1};
        System.out.println(profit(p));
    }
}
