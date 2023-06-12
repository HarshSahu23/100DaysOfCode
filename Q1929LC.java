public class Q1929LC {
    public static int[] name(int[] nums)
    {
        int size = nums.length;
        int[] n = new int[2*size];
        for (int i = 0; i < n.length; i++) {
            n[i]=nums[i%size];
        }
        System.gc();
        return n;
    }
    public static void main(String[] args) {
        int[] a = {4,5,6};
        int[] b = name(a);
        for (int i : b) {
            System.out.print(i+", ");
        }
    }
}
