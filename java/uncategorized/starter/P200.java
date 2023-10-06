package uncategorized.starter;

public class P200 {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    sum++;
                    traverse(grid,i,j);
                }
            }
        }
        return sum;
    }
    private final int[][] INTS = {
            {-1, 0},{0,-1},{1,0},{0, 1}
    };
    void traverse(char[][] grid, int col, int row){
        int m = grid.length;
        int n = grid[0].length;
        grid[col][row] = '0';
        for (int[] is : INTS) {
            int i = col + is[0];
            int j = row + is[1];
            if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == '1'){
                traverse(grid,i,j);
            }
        }

    }
}
