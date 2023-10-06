package uncategorized.starter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P934 {
    List<Integer> list1 = new ArrayList<>();
    public int shortestBridge(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean flag = true;
        Queue<int[]> queue = new LinkedList<int[]>();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1&&flag) {
                    tfs(grid, i, j);
                    flag = false;
                }else if(!flag&&grid[i][j] == 1){
                    list.add(new int[]{i,j});
                }
            }
        }
        tfs2(grid,list);
        int min = list1.get(0);
        for (int i: list1) {
            if(i<min){
                min = i;
            }
        }
        return min;
    }

    private void tfs2(int[][] grid,List<int[]> list){
        if(!list.isEmpty()) {
            int[] i = list.remove(0);
            tfs3(grid,i[0],i[1]);
            list1.add(sum);
            sum = 0;
            tfs2(grid,list);
        }
    }
    int sum = 0;
    private void tfs3(int[][] grid,int col, int row){
        int m = grid.length;
        int n = grid[0].length;
        grid[col][row] = 3;
        sum++;
        for (int[] is : INTS) {
            int i = col + is[0];
            int j = row + is[1];
            if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] != 2){
                tfs3(grid,i,j);
            }
        }
    }
    private void tfs(int[][] grid, int col, int row){
        int m = grid.length;
        int n = grid[0].length;
        grid[col][row] = 2;
        for (int[] is : INTS) {
            int i = col + is[0];
            int j = row + is[1];
            if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1){
                tfs(grid,i,j);
            }
        }
    }

    private final int[][] INTS = {
            {-1, 0},{0,-1},{1,0},{0, 1}
    };
}
