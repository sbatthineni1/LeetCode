public class ServerCommunication {
    public static void main(String[] args) {
        int[][] grid = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(countServers(grid));

    }

    public static int countServers(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[] rows = new int[row];
        int[] cols = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1){
                    rows[i]++;
                    cols[j]++;

                }
            }
        }
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)){
                    count++;
                }
            }
        }
        return count;

    }


}
