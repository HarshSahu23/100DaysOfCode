import Helpers.*;
public class Q283LC {
    public static void moveZeroes(int[] nums) {
        int size=nums.length;
        if (size>1) {
            int L=0,R=1;
            while((R<size)&&(L<size)){
                while (R<size) {
                    if (nums[R]!=0) {
                        break;
                    }R++;
                }
                if (R>=size) {
                    break;
                }
                while (L<size-1) {
                    if (nums[L]==0) {
                        int temp = nums[L];
                        nums[L]=nums[R];
                        nums[R]=temp;
                        break;
                    }L++;
                }
                R++;L++;
            }
        }
        
    }
    public static void moveZeroTwo(int[] nums){
        int i=0;
        for (int x : nums) {
            if (x!=0) {
                nums[i]=x;
                i++;
            }
        }
        for (int j = i; j < nums.length; j++) {
            nums[j]=0;
        }
    }
    public static void main(String[] args) {
        int[] test = GenerateMatrix.generateLinearMatrix(5, false,10);
        moveZeroes(test);
        System.out.println("succs");
        }
}
