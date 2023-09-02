public class Q1528LC {
    public String restoreString(String s, int[] indices) {
        // String restore="";

        char[] correctChar = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            correctChar[indices[i]]=s.charAt(i);
        }
        return new String(correctChar);
    }
    public static void main(String[] args) {
        
    }
}
