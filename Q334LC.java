public class Q334LC {
    public boolean increasingTriplet(int[] nums) {
        int i=0,k=0;
        int max_i=0,max_k=0;
        int temp=Integer.MAX_VALUE;
        for (i = 0; i < nums.length-2; i++) {
            if (nums[i]<temp) {
                temp=nums[i];
                max_i=i;
            }
        }
        temp=Integer.MIN_VALUE;
        for (k = i; k < nums.length; k++) {
            if (nums[k]>temp) {
                temp=nums[k];
                max_k=k;
            }
        }
        if ((max_i<max_k)&&(max_k-max_i>=2)) {
            System.out.println(max_i);
            System.out.println(max_k);
            return true;
        }
        else{
            System.out.println(max_i);
            System.out.println(max_k);
            return false;
        }
    }
}
