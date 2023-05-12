public class Q50LC {
        public static double myPow(double x, int n) {
                if(n == 0)
                if(n == 0)
                    return 1;
                if((n==Integer.MIN_VALUE)&&x!=1&&x!=-1){
                    return 0;
                }
                if((x==1||x==-1)&&n%2==0){
                    return 1;
                }
                if(x==-1&&n%2!=0){
                    return -1;
                }
                if(n<0){
                    n = -n;
                    x = 1/x;
                }
                return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    
        }
    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
    }
}
