public class Q238LC {
    public static int[] productExceptSelf(int[] nums) {
        int zeroIndex=-1;int size=nums.length;
        int numOfNonZeroValues=0; int numOfZeros=0;
        boolean arrayIsZero=true;
        boolean arrayIsSingleValued=false;
        int numOfOnes=0;int numOfNegativeSign=0;
        int[] pArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (nums[i]==0) {
                zeroIndex=i;
                numOfZeros+=1;
            }
            else{
                numOfNonZeroValues+=1;
                if (nums[i]==-1) {
                    numOfOnes+=1;
                    numOfNegativeSign+=1;
                }
                if (nums[i]==1) {
                    numOfOnes+=1;
                }
                arrayIsZero=false;}
        }
        if (numOfOnes==size) {
            int finalProduct=1;
            if (numOfNegativeSign%2!=0) {
                finalProduct=-1;
            }
            for (int i = 0; i < pArr.length; i++) {
                if (finalProduct==1) {
                    pArr[i]=nums[i]==-1?-1:1;
                }
                else{
                    pArr[i]=nums[i]==-1?1:-1;
                }
            }
            return pArr;
        }
        if (numOfNonZeroValues==1) {
            arrayIsSingleValued=true;
        }
        if (size==1) {
            return nums;
        }
        if (size==2&&numOfZeros<=1) {
            System.out.println("here");
            int temp=nums[1];
            pArr[1]=nums[0];
            pArr[0]=temp;
            return pArr;
        }
        if (arrayIsZero||(arrayIsSingleValued&&size>2)||numOfZeros>1) {
            for (int i = 0; i < size; i++) {
                pArr[i]=0;
            }
            return pArr;
        }
        if (zeroIndex==-1) {
            for (int i = 0; i < size; i++) {
                int leftBoundEnd = i-1;
                int rightBoundStart = i+1;
                int leftProduct=1; int rightProduct=1;
                for (int j = 0; j <= leftBoundEnd; j++) {
                    leftProduct*=nums[j];
                }
                for (int k = rightBoundStart; k < size; k++) {
                    rightProduct*=nums[k];
                }
                pArr[i]=leftProduct*rightProduct;
            }
            return pArr;
        }
        else{
            int tempProduct = 1;
            for (int j = 0; j < size; j++) {
                if(nums[j]!=0){
                    tempProduct*=nums[j];
                    pArr[j]=0;
                }
            }
            pArr[zeroIndex]=tempProduct;
            return pArr;
        }
        
    }
    public static int[] productExceptSelf2(int[] nums){
        int[] answer = new int[nums.length];

        //checking whether array is filled with 1's
        // boolean arrIsOne=true;int numOfNegativeSign=0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i]!=1||nums[i]!=-1) {
        //         arrIsOne=false;
        //     }
        //     if (nums[i]==-1) {
        //         numOfNegativeSign+=1;
        //     }
        // }
        // if (arrIsOne) {
        //     int finalProduct = numOfNegativeSign%2==0?1:-1;
        //     for (int i = 0; i < nums.length; i++) {
        //         if (finalProduct==1) {
        //             answer[i]=nums[i]==1?1:-1;
        //         }
        //         else{
        //             answer[i]=nums[i]==1?-1:1;
        //         }
        //     }
        //     return answer;
        // }
        
        answer[0]=1;
        for (int i = 1; i < answer.length; i++) {
            answer[i]=answer[i-1]*nums[i-1];
        }
        int tempProduct=1;
        for (int i = (nums.length)-1; i >=0; i--) {
            answer[i]=answer[i]*tempProduct;
            tempProduct*=nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1,-1,1,1,-1,1,-1};
        int[] result = productExceptSelf2(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"  ");
        }
    }
}
