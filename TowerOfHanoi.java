public class TowerOfHanoi
{
    public static void toh(int n, int from, int aux, int to,String ind) {
        if (n==1) {
            String p = String.format(ind+"Moved disc 1 from %d to %d", from, to);
            System.out.println(p);
            return;
        }
        System.out.println(ind+"Moving discs 1 to "+(n-1)+" from "+from+" to "+aux+".");
        toh(n-1, from, to, aux,ind+"\t");
        String p = String.format(ind+"Moved disc %d from %d to %d",n, from, to);
        System.out.println(p);
        System.out.println(ind+"Moving discs 1 to "+(n-1)+" from "+aux+" to "+to+".");
        toh(n-1, aux, from, to,ind+"\t");
    }
    public static void main(String[] args) {
        toh(5, 1, 3, 2,"");
        //ind stands for the level of indentation for clear reading
    }
}