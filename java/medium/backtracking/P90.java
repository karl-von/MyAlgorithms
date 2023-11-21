package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Given an integer array nums that may contain duplicates, return all possible
//subsets (the power set).
//
// The solution set must not contain duplicate subsets. Return the solution in
//any order.
//
//
// Example 1:
// Input: nums = [1,2,2]
//Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
//
// Example 2:
// Input: nums = [0]
//Output: [[],[0]]
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
//


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
