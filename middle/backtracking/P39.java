package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<Integer> step = new LinkedList<>();
        int len = candidates.length;
        if (len == 0) {
            return resultList;
        }
        step(resultList, step, candidates, 0, target, 0, len);
        return resultList;

    }

    private void step(List<List<Integer>> resultList, LinkedList<Integer> step, int[] candidates, int index, int target, int begin, int len) {
        if (index > target) {
            return;
        } else if (index == target) {
            resultList.add(new ArrayList<>(step));
            return;
        } else {
            for (int i = begin; i < len; i++) {
                int candidate = candidates[i];
                step.add(candidate);
                step(resultList, step, candidates, index + candidate, target, i,len);
                step.removeLast();
            }
        }
    }
}
