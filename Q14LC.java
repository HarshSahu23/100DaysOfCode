class Q14LC
{
    public static String Prefix(String[] strs){

        int strArrLen = strs.length;
        int minWordIndex=0;String minWord=strs[0];
        int minWordLength=minWord.length();
        String prefix=minWord;
        int numOfWordsMatch=0;boolean prefixFound = false;

        for (int i = 0; i < strArrLen; i++) {
            String currWord = strs[i];
            if (currWord.length()<=minWordLength) {
                minWordIndex=i;
                minWord=currWord;
                minWordLength=currWord.length();
            }
        }
        System.out.println("minWord,minWordIndex,minWordLength");
        System.out.println(minWord+" "+minWordIndex+" "+minWordLength);

        System.out.println("");

        for (int i = minWordLength-1; i >=0; i--) {
            System.out.println("i = "+i);
            numOfWordsMatch=0;
            for (int j = 0; j < strArrLen; j++) {
                
                boolean prefixMatched = false;
                System.out.println("\tj     = "+j);
                System.out.println("\tmatch = "+numOfWordsMatch);
                System.out.println("\tfound = "+prefixMatched);
                if (j==minWordIndex) {
                    System.out.println("\tmatching with same word, skip ...");
                    continue;
                }
                System.out.println("\t\tstrs[j].charAt(k)\tminWord.charAt(k)");
                for (int k = 0; k <= i; k++) {
                    System.out.println("\t\tk = "+k);
                    
                    System.out.println("\t\t"+strs[j].charAt(k)+"\t"+minWord.charAt(k)+"\t"+(strs[j].charAt(k)==minWord.charAt(k)));
                    if (strs[j].charAt(k)==minWord.charAt(k)) {
                        prefixMatched=true;
                    }
                    else{
                        prefixMatched=false;
                        break;
                    }
                }
                if (prefixMatched) {
                    numOfWordsMatch+=1;
                }
                System.out.println("\t\tfound = "+prefixMatched);
                System.out.println("\t\tmatch = "+numOfWordsMatch);
                if (!prefixMatched) {
                    System.out.println("\tcurrently assumed prefix wasn't found in atleast 1 word, skipping ...");
                    break;
                }
            }
            System.out.println("\tMatch = "+numOfWordsMatch);
            if (numOfWordsMatch==strArrLen-1) {
                prefix="";
                for (int index = 0; index <= i; index++) {
                    prefix=prefix+(""+minWord.charAt(index));
                }
                prefixFound=true;
                break;
            }
            System.out.println("\tprefix = "+prefix);

        }
        if (!prefixFound) {
            return "";
        }
        else{
            return prefix;
        }
    }
    public static void main(String[] args)
    {
        // String[] s = {"flower","flow","flight","flock"};

        String[] s={"cir","car"};
        System.out.println(Prefix(s));
    }
}