import java.text.MessageFormat;
import java.util.*;

public class Q728LC {
    public static List<Integer> selfDivide(int left, int right)
    {
        
        List<Integer> L=new ArrayList<Integer>();  
        for (int i = left; i <= right; i++) {
            boolean isSelfDivide = true;
            int num=i;
            while (num>0) {
                int currentDivideValue=num%10;
                if (currentDivideValue==0) {
                    isSelfDivide=false;
                    break;
                }
                if (i%currentDivideValue!=0) {
                    isSelfDivide=false;
                    break;
                }
                num=num/10;
            }
            // System.out.println(MessageFormat.format("i = {0} & isSelfDiv = {1}", i,isSelfDivide));
            if (isSelfDivide) {
                L.add(i);
            }
        }
        return L;
    }
    public static void main(String[] args) {
        List<Integer> answer=new ArrayList<Integer>();  
        int left = 1;   int right = 22;
        answer = selfDivide(left, right);
        
        System.out.println(
            MessageFormat.format(
                "\nPrinting all self dividing numbers between {0} & {1}\n", left,right
                ));

        for (Integer i : answer) {
            System.out.print(i+" ");
        }
    }
}
