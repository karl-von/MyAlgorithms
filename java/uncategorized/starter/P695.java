package uncategorized.starter;

import java.util.ArrayList;
import java.util.List;

public class P695 {
    List<Integer> list = new ArrayList<>();
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1){
                    int sum = 0;
                    list.add(tfs(grid,i,j,sum));
                }
            }
        }
        if(list.size()>0){
            int max = list.get(0);
            for (int i:list) {
                if(i>max){
                    max = i;
                }
            }
            return max;
        }else{
            return 0;
        }
    }
    private int tfs(int[][] grid,int col,int row,int sum) {
        int m = grid.length;
        int n = grid[0].length;
        grid[col][row] = 2;
        for (int[] is : INTS) {
            int i = col + is[0];
            int j = row + is[1];
            if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1){
                sum++;
                tfs(grid,i,j,sum);
            }
        }
        return sum;
    }

    private final int[][] INTS = {
            {-1, 0},{0,-1},{1,0},{0, 1}
    };
}
