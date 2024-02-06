import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        solve(board);

    }

    public static void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);
            if (board[i][col - 1] == 'O')
                dfs(board, i, col - 1);
        }
        for (int j = 0; j < col; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
            if (board[row - 1][j] == 'O')
                dfs(board, row - 1, j);
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '1'){
                    board[i][j] = 'O';
                }
            }
        }
        System.out.println(Arrays.deepToString(board));
    }

    public static void dfs(char[][] board, int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != 'O')
            return;
        board[row][col] = '1';

        dfs(board, row + 1, col);
        dfs(board, row - 1, col);
        dfs(board, row, col + 1);
        dfs(board, row, col - 1);


    }
}
