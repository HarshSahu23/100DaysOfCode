public class Q7LC
{
    public static int reverse(int x) {
        int r=0;int num;String store="";
        String maxInt = Integer.toString(Integer.MAX_VALUE);
        String minInt = "2147483648";

        if (x<0) {
            num=0-x;
            while (num>0) {
                store+=Integer.toString(num%10);
                num/=10;
            }
            if ((store.compareTo(minInt)>0)&&(store.length()>=minInt.length())) {
                r=0;
            }else{
                if (store!="") {
                    r=0-Integer.parseInt(store);
                }
            }
        } else {
            num=x;
            while (num>0) {
                store+=Integer.toString(num%10);
                num/=10;
            }
            
            if ((store.compareTo(maxInt)>0)&&(store.length()>=maxInt.length())) {
                r=0;
            }else{
                if (store!="") {
                    r=Integer.parseInt(store);
                }
                
            }
            
        }
        return r;
    }
    public static void main(String[] args)
    {
        System.out.println("ans = "+reverse(-2147483648));
    }
}