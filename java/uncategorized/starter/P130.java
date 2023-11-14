package uncategorized.starter;

public class P130 {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    traverse(board, i, j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                } else if (board[i][j] == '0') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private final int[][] INTS = {
            {-1, 0}, {0, -1}, {1, 0}, {0, 1}
    };

    void traverse(char[][] grid, int col, int row) {
        if (grid[col][row] == '1' || grid[col][row] == 'X') {
            return;
        }
        int m = grid.length;
        int n = grid[0].length;
        for (int[] is : INTS) {
            int i = col + is[0];
            int j = row + is[1];
            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '1') {
                grid[col][row] = '1';
                return;
            } else {
                traverse(grid, i, j);
            }
        }

    }
//        int m = grid.length;
//        int n = grid[0].length;
//
//        for (int[] is : INTS) {
//            int i = col + is[0];
//            int j = row + is[1];
//            if (i < 0 || i >= m|| j < 0 || j >= n){
//                grid[col][row] = '1';
//                return;
//            }
//        }
//        for (int[] is : INTS) {
//            int i = col + is[0];
//            int j = row + is[1];
//            if(grid[i][j]=='1'){
//
//                return;
//            }
//        }
//        grid[col][row]='X';
//    }
}
