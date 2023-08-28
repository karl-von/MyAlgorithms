import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<Integer> stepList = new LinkedList<>();
        Arrays.sort(candidates);
        search(resultList, stepList, candidates, target, 0, 0);
        return resultList;
    }

    private void search(List<List<Integer>> resultList, LinkedList<Integer> stepList, int[] candidates, int target, int step, int begin) {
        if (step > target) {
            return;
        }
        if (step == target) {
            resultList.add(new ArrayList<>(stepList));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            stepList.add(candidates[i]);
            search(resultList, stepList, candidates, target, step + candidates[i], i + 1);
            stepList.removeLast();
        }
    }
}
