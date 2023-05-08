class Solution {
    public static boolean isPalindrome(int x) {
        int rev=0;int num=x;
        
        if(x<0){
            return false;
        }
        else{
            while(num>0){
            rev = rev*10 + num%10;
            num = num/10;

        }
            if(rev==x){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}