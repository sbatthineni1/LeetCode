import java.util.Arrays;

public class FIndRotations {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}}, target = {{1, 0}, {0, 1}};
        System.out.println(findRotation(mat, target));

    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target))
                return true;
            rotate90(mat);
        }
        return false;

    }

    public static boolean isEqual(int[][] mat, int[][] target) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void rotate90(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
