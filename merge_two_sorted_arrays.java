public class merge_two_sorted_arrays {
    public static int[] merge(int[] X, int[] Y){

        int xSize = X.length;
        int ySize = Y.length;
        int mSize = xSize+ySize;
        int[] merged = new int[mSize];
        for (int i=0,j=0,k=0; i < mSize; i++) {
            if (i<mSize-2) {
                int value = Math.min(X[j],Y[k]);
                merged[i]=value;
                if (value==X[j]) {
                    j++;
                }if (value==Y[k]) {
                    k++;
                }
            }
            if (i==mSize-2) {
                // System.out.println("here"+j+"\t"+k);
                int index=Math.min(j, k);
                merged[i]=Math.min(X[index], Y[index]);
                merged[i+1]=merged[i]==X[index]?Y[index]:X[index];
            }
        }
        return merged;


    }
    public static void main(String[] args) {
        int[] X = {5,8,9};
        int[] Y = {4,7,8};
        int[] m = merge(X, Y);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]+" ");
        }

    }
}
