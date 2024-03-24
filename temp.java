import java.util.HashSet;

public class temp {
    static void gfSeries(int N){
        // code here
        long[] T = new long[N];
        T[0] = 0L;
        T[1] = 1L;
        System.out.print(T[0]+" ");
        System.out.print(T[1]+" ");
        for (int i = 2; i < T.length; i++) {
            T[i] =(long) (Math.pow(T[i-2], 2)-T[i-1]);
            System.out.print(T[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        gfSeries(15);
    }
}
