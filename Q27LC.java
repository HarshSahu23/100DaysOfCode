
public class Q27LC {
    public static int removeElement(int[] nums,int val){
        int j = 0;    
        for(int i = 0; i < nums.length; i++){
        if(nums[i] != val){
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
}
    public static void main(String[] args) {
        // int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = new int[0];
        int val = 2;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        int ans=removeElement(nums,0);
        System.out.println("ans = "+ans);

        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
