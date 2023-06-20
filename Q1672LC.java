public class Q1672LC {
    public static int maximumWealth(int[][] accounts)
    {
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp=0;
            for (int j = 0; j < accounts[0].length; j++) {
                temp+=accounts[i][j];
            }
            if (temp>=wealth) {
                wealth=temp;
            }
        }
        return wealth;
    }
    public static void main(String[] args) {
        int[][] ac = {{32,74,29,22,94},{34,79,40,74,32},{8,20,86,9,6},{44,16,83,30,100},{48,86,60,48,61}};
        System.out.println("max wealth = "+maximumWealth(ac));

    }
}
