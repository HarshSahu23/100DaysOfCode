public class Q1281LC {
    public static int subtractProductAndSum(int n)
    {
        int product=1,sum=0;
        while (n>0) {
            product*=(n%10);
            sum+=(n%10);
            n=n/10;
        }
        // System.out.println(product);
        // System.out.println(sum);
        return Math.abs(product-sum);
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
