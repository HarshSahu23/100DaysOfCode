public class Q2114LC {
    public static int mostWordsFound(String[] sentences)
    {
        int max=0;
        for (String s : sentences) {
            int words=(s.split(" ")).length;
            if (words>max) {
                max=words;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}
