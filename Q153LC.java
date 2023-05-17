public class Q153LC {
    public static int findMin(int[] nums) {
        int size = nums.length;
        int min=0;
        if (size==0) {
            return min;
        }
        if (size==1) {
            return nums[0];
        }
        if (size==2) {
            min=nums[0]>nums[1]?nums[1]:nums[0];
        }
        int left= 0,right=size-1,mid;
        while (left<right) {
            mid=(left+right)/2;
            if (nums[mid]>nums[right]) {
                left=mid+1;
            }
            else{right=mid;}
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,0,1,2};
        System.out.println(findMin(arr));
    }
}
