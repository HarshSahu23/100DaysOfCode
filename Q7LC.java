class Q7LC {
    public static int reverse(int x) {
        int num=x;String rev="";int r=0;
        if (x<0) {
            num=0-x;
            while(num>0){
                rev+=Integer.toString(num%10);
                num=num/10;
            }
            if ((rev.compareTo("2147483648")>0)&&(rev.length()==9)) {
                r=0;
            }else{
                r=0-Integer.parseInt(rev);
            }
            System.out.println(rev);
        }
        if(x>0){
            while(num>0);{
                rev+=Integer.toString(num%10);
                num=num/10;
            }
            System.out.println(rev);
            if ((rev.compareTo("2147483647")>0)&&(rev.length()==9)) {
                r=0;
            }else{
                r=Integer.parseInt(rev);
            }
            System.out.println(rev);
        }
        if (x==0) {
            r=0;
        }
        System.out.println(rev);
        return r;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}