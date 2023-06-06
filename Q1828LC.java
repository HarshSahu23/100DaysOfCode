import java.util.*;
public class Q1828LC {
    public static int[] countPoints(int[][] points, int[][] queries) {

        int qlen = queries.length;
        int plen = points.length;

        int[] answer = new int[queries.length];
        Arrays.fill(answer, 0, qlen, 0);

        double distance=0,radius=0;
        for (int i = 0; i < qlen; i++) {
            for (int j = 0; j < plen; j++) {
                distance = Math.pow((points[j][0]-queries[i][0]), 2) + Math.pow((points[j][1]-queries[i][1]), 2);
                radius=Math.pow(queries[i][2], 2);
                if (distance<=radius) {
                    answer[i]+=1;
                }
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        int[] a = countPoints(points, queries);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
//points[i] = [xi, yi]
//queries[j] = [xj, yj, rj]
