package uncategorized.starter;

public class P463 {
    int chang = 0;
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    bfs(grid,i,j);
                }
            }
        }
        return chang;
    }
    private final int[][] INTS = {
            {-1, 0},{0,-1},{1,0},{0, 1}
    };

    public void bfs(int[][] grid, int col, int row){
        int m = grid.length;
        int n = grid[0].length;
        grid[col][row] = 2;
        for (int[] is : INTS) {
            int i = col + is[0];
            int j = row + is[1];
            if(j < 0 || j >= n || i < 0 || i >= m || grid[i][j] == 0 ){
                chang++;
            }else if(grid[i][j] == 2){

            }else{
                bfs(grid,i,j);
            }
        }
    }
}
