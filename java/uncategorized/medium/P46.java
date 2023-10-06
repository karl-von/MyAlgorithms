package uncategorized.medium;

import java.util.ArrayList;
import java.util.List;

public class P46 {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, 0);
        return list;
    }

    private void dfs(int[] nums, int step) {
        if (step >= nums.length) {
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!path.contains(nums[i])){
                path.add(nums[i]);
                dfs(nums, step + 1);
                path.remove(path.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        P46 p46 = new P46();
        p46.permute(new int[]{
                1, 2, 3
        });
        for (List<Integer> l : p46.list) {
            for (int i = 0; i < l.size(); i++) {
                System.out.print(l.get(i));
            }
            System.out.println();
        }
    }
}

