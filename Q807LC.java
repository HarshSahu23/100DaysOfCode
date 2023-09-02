

class Q807LC
{
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;int j;int heightIncrease=0;
        for (int i = 0; i < n; i++) {
            j=0;int k = j;
            int maxInRow=grid[i][j], maxInCol=grid[i][j];
            for (;j < n; j++) {
                if (grid[i][j]>maxInRow) {
                    maxInRow=grid[i][j];
                }
                if (grid[j][k]>maxInCol) {
                    maxInCol=grid[j][k];
                }
            }
            int compare = Math.min(maxInRow, maxInCol);
            for (int l = 0; l < grid.length; l++) {
                if (grid[i][l]<compare) {
                    heightIncrease+=(compare-grid[i][l]);
                    grid[i][l]=compare;
                }
            }
        }
        return heightIncrease;
    }
    public static void main(String[] args)
    {
        char a=65;
        int b='A';
        System.out.println(a);
        System.out.println(b);


        // System.err.("fuck ");
    }
}