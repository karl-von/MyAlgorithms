package uncategorized.medium;

import java.util.ArrayList;
import java.util.List;

public class P22_ {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String sb = "";
        dfs(n, 0, 0, sb);
        return result;
    }

    private void dfs(int n, int left, int right, String sb) {
        if (left == n && right == n) {
            result.add(sb);
        } else {
            if (left < n) {
                dfs(n, left+1, right, sb + "(");
            }
            if (right < n && right < left) {
                dfs(n, left, right+1, sb + ")");
            }
        }
    }
}
