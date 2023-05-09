// import java.util.*;
public class Q8LC {
        public static int StoI(String x){
            String sVal=x;int ans=0;boolean isNegative=false;
            int FirstNumEncounterIndex=0;int signIndex=0;
            int tempVal;long tempStore=0;long minInt =  2147483648L;int checkMultipleSignCount=0;
            sVal=x.trim();
            if (sVal.length()==0) {
                return ans;
            }
            else{
                boolean ecase1 = (!((sVal.charAt(0)=='-')||(sVal.charAt(0)=='+')||((int) sVal.charAt(0)>47)&&((int) sVal.charAt(0)<58)));
                if (ecase1) {
                    return ans;
                }
                for (int i = 0; i < sVal.length(); i++) {
                    if (sVal.charAt(i)=='-') {
                        isNegative=true;
                        signIndex=i;
                        checkMultipleSignCount+=1;
                    }
                    if (sVal.charAt(i)=='+') {
                        isNegative=false;
                        signIndex=i;
                        checkMultipleSignCount+=1;
                    }
                    if (((int) sVal.charAt(i)>47)&&((int) sVal.charAt(i)<58)) {
                        FirstNumEncounterIndex=i;
                        break;
                    }
                }
                if (checkMultipleSignCount>1) {
                    return ans;
                }
                if (((FirstNumEncounterIndex-signIndex==1)&&(checkMultipleSignCount==1)||checkMultipleSignCount==0)) {
                    for (int i = FirstNumEncounterIndex; i < sVal.length(); i++) {
                        if (((int) sVal.charAt(i)>47)&&((int) sVal.charAt(i)<58)) {
                            tempVal=sVal.charAt(i)-'0';
                            tempStore = tempStore*10 +tempVal;
                            if((tempStore>(minInt-1))&&!isNegative){
                                ans=Integer.MAX_VALUE;
                                return ans;
                            }
                            if ((tempStore>(minInt))&&isNegative) {
                                ans=Integer.MIN_VALUE;
                                return ans;
                            }
                            if ((ans+tempVal<(minInt-1)&&!isNegative)||(ans+tempVal<(minInt)&&isNegative)) {
                                ans = ans*10+tempVal;
                            }
                        }
                        else{
                            break;
                        }
                    }
                }
                ans=isNegative?0-ans:ans;
                return ans;
            }
        }
        public static void main(String[] args) {

            String test = "words and 987";
            System.out.println(test);
            System.out.println(StoI(test));
        }
}

