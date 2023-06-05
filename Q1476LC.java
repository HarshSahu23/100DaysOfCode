public class Q1476LC {
    private int[][] Rectangle;
    public Q1476LC(int[][] rectangle) {
        int rows = rectangle.length;
        int columns = rectangle[0].length;
        Rectangle = new int[rows][columns];
        Rectangle=rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                Rectangle[i][j]=newValue;
            }
        }
    }
    public void printArray(){
        System.out.println();
        for (int i = 0; i < Rectangle.length; i++) {
            for (int j = 0; j < Rectangle[0].length; j++) {
                System.out.print(Rectangle[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public int getValue(int row, int col) {
        return Rectangle[row][col];
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,8,7},{4,5,6,5,8},{7,8,9,1,5},{5,6,3,9,4},{1,1,5,9,9}};
        Q1476LC obj = new Q1476LC(arr);
        obj.printArray();
        // System.out.println("1,1 = "+obj.getValue(1, 1));
        // System.out.println("2,2 = "+obj.getValue(2, 2));
        System.out.println("modifying ...");
        obj.updateSubrectangle(1, 1, 2, 2, 0);
        System.out.println("after updation");
        // System.out.println("1,1 = "+obj.getValue(1, 1));
        // System.out.println("2,2 = "+obj.getValue(2, 2));
        obj.printArray();

    }
}
