import java.util.Arrays;

public class ColRearrange {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0},{1,0,1}};
        System.out.println(largestSubmatrix(matrix));

    }

    public static int largestSubmatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] +=matrix[i - 1][j];
                }
            }
        }
        int maxArea = 0;
        for (int i = 0; i < row; i++) {
            Arrays.sort(matrix[i]);
            for(int j = 0; j < col; j++){
                int minHeight = matrix[i][j];
                maxArea = Math.max(maxArea, minHeight * ( col - j));
            }

        }
        return maxArea;


    }

}
