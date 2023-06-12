public class Q2011LC {
    public static int finalValueAfterOperations(String[] operations) 
    {
        int X = 0;
        char c ;
        for (String s : operations) {
            c = s.charAt(1);
            if (c=='+') {
                X+=1;
            }
            if(c=='-'){
                X=X-1;
            }
        }
        return X;
    }
    public static void main(String[] args) {
        
    }
}
