public class Q2535LC {
    // public int differenceOfSum(int[] nums) {
    //     int sumElement=0;
    //     int sumDigits=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]<10){
    //             sumElement+=nums[i];
    //             sumDigits+=nums[i];
    //         }
    //         else{
    //             sumElement+=nums[i];
    //             while (nums[i]>0) {
    //                 sumDigits+=nums[i]%10;
    //                 nums[i]=nums[i]/10;
    //             }
    //         }
    //     }
    //     return Math.abs(sumDigits-sumElement);
    // }
    public int differenceOfSum(int[] nums) {
        int absSum=0;
        for (int i = 0; i < nums.length; i++) {
            absSum+=nums[i];
            absSum-=(nums[i]%10+((nums[i]/10)%10)+((nums[i]/100)%10)+((nums[i]/1000)%10));
        }
        return absSum;
    }
    public static void main(String[] args)
    {
        
    }
}
