package uncategorized.medium;

import java.util.ArrayList;
import java.util.List;

public class P78 {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return list;
    }

    private void dfs(int[] nums, int step) {
        if (step > nums.length) {
            return;
        }else {
            list.add(new ArrayList<>(path));
        }
        for (int i = step; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i + 1);
            path.remove(path.size()-1);
        }
    }
}
