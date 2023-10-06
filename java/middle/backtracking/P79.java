package middle.backtracking;

//Given an m x n grid of characters board and a string word, return true if
//word exists in the grid.
//
// The word can be constructed from letters of sequentially adjacent cells,
//where adjacent cells are horizontally or vertically neighboring. The same letter
//cell may not be used more than once.
//
//
// Example 1:
//
//
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCCED"
//Output: true
//
//
// Example 2:
//
//
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "SEE"
//Output: true
//
//
// Example 3:
//
//
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCB"
//Output: false
//
//
//
// Constraints:
//
//
// m == board.length
// n = board[i].length
// 1 <= m, n <= 6
// 1 <= word.length <= 15
// board and word consists of only lowercase and uppercase English letters.
//
//
//
// Follow up: Could you use search pruning to make your solution faster with a
//larger board?
//

public class P79 {
    public boolean exist(char[][] board, String word) {
        char first = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == first) {
                    if (search(board, word, board.length, board[0].length, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int m, int n, int i, int j, int step) {
        if (step == word.length()) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(step)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';

        boolean found =
                search(board, word, m, n, i + 1, j, step + 1) ||
                        search(board, word, m, n, i - 1, j, step + 1) ||
                        search(board, word, m, n, i, j + 1, step + 1) ||
                        search(board, word, m, n, i, j - 1, step + 1);

        board[i][j] = temp; // 恢复原字符
        return found;
    }
}
