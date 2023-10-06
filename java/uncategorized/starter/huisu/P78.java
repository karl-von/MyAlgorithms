package uncategorized.starter.huisu;



import java.util.ArrayList;
import java.util.List;

public class P78  {

    List<Integer> chosen = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        recur(nums, 0);
        return ans;
    }



    public void recur(int[] nums, int i) {
        int length = nums.length;
        if (i == length) {
            ans.add(new ArrayList<>(chosen));
            return;
        }
//            选
        recur(nums, i + 1);
        chosen.add(nums[i]);
//            不选
        recur(nums, i + 1);
//            还原
        chosen.remove(chosen.size() - 1);
    }
}
