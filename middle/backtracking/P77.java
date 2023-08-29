package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<Integer> stepList = new LinkedList<>();
        search(resultList,stepList,n,k,1);
        return resultList;
    }

    private void search(List<List<Integer>> resultList, LinkedList<Integer> stepList, int n, int k, int begin) {
        if (stepList.size() == k) {
            resultList.add(new ArrayList<>(stepList));
            return;
        }
        for (int i = begin; i <= n; i++) {
            stepList.add(i);
            search(resultList, stepList, n, k, i + 1);
            stepList.removeLast();
        }
    }
}
