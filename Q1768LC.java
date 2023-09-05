public class Q1768LC {
    public String mergeAlternately(String word1, String word2) {
        if (word1 == null) return word2;
        else if (word2 == null) return word1;
        StringBuilder builder = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        int index = 0;
        while (index < min) {
            builder.append(word1.charAt(index));
            builder.append(word2.charAt(index));
            index++;
        }
        while (index < word1.length()) {
            builder.append(word1.charAt(index));
            index++;
        }
        while (index < word2.length()) {
            builder.append(word2.charAt(index));
            index++;
        }
        return builder.toString();
    }
    public String mergeAlternately2(String word1, String word2) {
        
        int min=Math.min(word1.length(),word2.length());
        int max=Math.max(word1.length(),word2.length());
        boolean word1longer = word1.length()>word2.length();

        char[] merged = new char[word1.length()+word2.length()];
        for(int i=0,j=0;i<max;i++){
            if (i<min) {
                merged[j]=word1.charAt(i);
                merged[j+1]=word2.charAt(i);
            }else{
                if(word1longer){
                    merged[j]=word1.charAt(i);
                }else{
                    merged[j]=word2.charAt(i);
                }
            }
            j++;
        }
        return new String(merged);

    }
}
