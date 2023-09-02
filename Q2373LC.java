import Helpers.GenerateMatrix;
import Helpers.PrintMatrix;
class Q2373LC {
    public static int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int tempMax;
        int ans[][] = new int[n-2][n-2];
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                tempMax=Integer.MIN_VALUE;
                for (int x = i; x <=i+2; x++) {
                    for (int y = j; y <= j+2; y++) {
                        if (grid[x][y]>= tempMax) {
                            tempMax=grid[x][y];
                        }
                    }
                }
                ans[i][j]=tempMax;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] test = GenerateMatrix.generateSquareMatrix
        (5, 5, false, 9);
        PrintMatrix.printMatrixSquare(test);
        int[][] ans = largestLocal(test);
        System.out.println();
        PrintMatrix.printMatrixSquare(ans);
    }
}