package medium.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Given two integers n and k, return all possible combinations of k numbers
//chosen from the range [1, n].
//
// You may return the answer in any order.
//
//
// Example 1:
//
//
//Input: n = 4, k = 2
//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//Explanation: There are 4 choose 2 = 6 total combinations.
//Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to
//be the same combination.
//
//
// Example 2:
//
//
//Input: n = 1, k = 1
//Output: [[1]]
//Explanation: There is 1 choose 1 = 1 total combination.
//
//
//
// Constraints:
//
//
// 1 <= n <= 20
// 1 <= k <= n
//

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
