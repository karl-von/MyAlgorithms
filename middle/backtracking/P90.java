import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<Integer> stepList = new LinkedList<>();
        Arrays.sort(nums);
        dfs(resultList,stepList,nums,0);
        return resultList;
    }

    public void dfs(List<List<Integer>> resultList, LinkedList<Integer> stepList, int[] nums, int step) {

        resultList.add(new ArrayList<>(stepList));
        for (int i = step; i < nums.length; i++) {
            if (i>step&&nums[i]==nums[i-1]){
                continue;
            }
            stepList.add(nums[i]);
            dfs(resultList, stepList, nums, i+1);
            stepList.removeLast();
        }
    }
}
