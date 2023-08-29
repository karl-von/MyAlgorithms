package backtracking;

import java.util.*;

public class P47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<Integer> stepList = new LinkedList<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        Arrays.sort(nums);

        step(resultList, stepList, nums, indexMap, nums.length);

        return resultList;
    }

    private void step(List<List<Integer>> resultList, LinkedList<Integer> stepList, int[] nums, Map<Integer, Integer> indexMap,  int len) {
        if (stepList.size() == len) {
            resultList.add(new ArrayList<>(stepList));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (indexMap.containsKey(i)) {
                continue;
            }
            int num = nums[i];
            if (i > 0 && num == nums[i - 1] && !indexMap.containsKey(i - 1)) {
                continue;
            }
            indexMap.put(i, num);
            stepList.add(num);
            step(resultList, stepList, nums, indexMap, len);
            indexMap.remove(i);
            stepList.removeLast();
        }
    }
}
