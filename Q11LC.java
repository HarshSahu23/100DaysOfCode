public class Q11LC {
    public static int maxArea(int[] height) {
        if (height.length==2) {
            return Math.min(height[0],height[1]);
        }
        else{
            int n = height.length;
            int i=0,j=n-1;
            int leftHigh=0;int rightHigh=n-1;
            int distance=j-i;
            int currWater = distance*Math.min(height[j],height[i]);
            int maxWater = currWater;
            int LI_max = n%2==0?(n/2)-1:n/2;
            while (i<LI_max) {
                if ((height[leftHigh]<height[i])||i==0) {
                    leftHigh=i;
                    distance=j-i;
                    currWater=distance*Math.min(height[j],height[i]);
                    maxWater=currWater>maxWater?currWater:maxWater;
                    i++; continue;
                }
                i++;
                if ((height[rightHigh]<height[j])||j==n-1) {
                    rightHigh=j;
                    distance=j-i;
                    currWater=distance*Math.min(height[j],height[i]);
                    maxWater=currWater>maxWater?currWater:maxWater;
                }
                j--;
            }
            System.out.println("Left High = "+leftHigh+" val = "+height[leftHigh]);
            System.out.println("Right High = "+rightHigh+" val = "+height[rightHigh]);
            return maxWater;
        }
    }
    public static int maxArea2(int[] height){
        if (height.length==2) {
            return Math.min(height[0],height[1]);
        }
        else{
            int n = height.length;
            int i = 0;int j=n-1;
            int water = (j-i)*Math.min(height[i], height[j]);
            while (i<j) {
                water = Math.max(water, (j-i)*Math.min(height[i], height[j]));
                if (height[i]<height[j]) {
                    i++;
                }else{
                    j++;
                }
            }
            return water;
        }
    }
    public static void main(String[] args) {
        int[] test = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(test));
    }
}
