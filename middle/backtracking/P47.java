package backtracking;

import java.util.*;

//Given a collection of numbers, nums, that might contain duplicates, return
//all possible unique permutations in any order.
//
//
// Example 1:
//
//
//Input: nums = [1,1,2]
//Output:
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
//
//
// Example 2:
//
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 8
// -10 <= nums[i] <= 10
//

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
