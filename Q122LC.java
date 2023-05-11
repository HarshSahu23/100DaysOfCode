public class Q122LC {
    public static int profit(int[] prices){
        
        int currentProfit=0; int newProfit=0;
        int startPrice = prices[0]; 
        for (int i = 1; i < prices.length; i++) {
            System.out.println("i\tsPrice\tprices[i]\tnewP\tcurrP");
            if (prices[i]<startPrice) {
                startPrice=prices[i];
            }
            System.out.println(i+"\t"+startPrice+"\t"+prices[i]+"\t"+newProfit+"\t"+currentProfit);
            newProfit=prices[i]-startPrice;
            System.out.println(i+"\t"+startPrice+"\t"+prices[i]+"\t"+newProfit+"\t"+currentProfit);
            if (newProfit>0) {
                currentProfit+=newProfit;
                startPrice=prices[i];
            }
            System.out.println(i+"\t"+startPrice+"\t"+prices[i]+"\t"+newProfit+"\t"+currentProfit);
            if((newProfit<currentProfit)&&(prices[i]<startPrice)){
                startPrice=prices[i];
            }
            System.out.println(i+"\t"+startPrice+"\t"+prices[i]+"\t"+newProfit+"\t"+currentProfit);
            System.out.println("--------------------------------------------------------------");
        }
        return currentProfit;
    }
    public static void main(String[] args) {
        int[] p = {7,1,5,3,6,4};
        // int[] p = {7,6,4,3,1};
        System.out.println(profit(p));
    }
}
