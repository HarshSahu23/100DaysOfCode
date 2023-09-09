public class Q605LC {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n>(Math.floor(flowerbed.length)+1)) {
            return false;
        }
        else{
            int L=flowerbed.length;
            if (L==1) {
                return n>0?flowerbed[0]==0?true:false:true;
            }
            else{
                int count=0;
                if (L==2) {
                    boolean isEmpty=(flowerbed[0]==0)&&(flowerbed[1]==0);
                    if (n<=1) {
                        if (isEmpty) {
                            return true;
                        }
                        else{
                            if (n==0) {
                                return true;
                            }
                            else{
                                return false;
                            }
                        }
                    }
                    else{
                        return false;
                    }
                }
                else{
                    for (int i = 0; i < flowerbed.length-1; i++) {
                        if (flowerbed[i]==0) {
                            if (flowerbed[i+1]==0) {
                                flowerbed[i]=1;count++;i++;continue;
                            }else{
                                i+=2;continue;
                            }
                        }
                        if (flowerbed[i]==1) {
                            i++;
                        }
                    }
                }
                if ((flowerbed[L-1]==0)&&flowerbed[L-2]==0) {
                    count++;
                }
                return count>=n;
            }
        }
    }
}
