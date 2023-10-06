package uncategorized.starter.huisu;

import java.util.ArrayList;
import java.util.List;

public class P216 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k,n,0,0);
        return lists;
    }
    private void dfs(int k, int n, int start, int tar) {
        if(path.size()==k&&tar==n){
            lists.add(path);
            return;
        }
        if(tar>k){
            return;
        }
        for (int i = start; i < n; i++) {
            path.add(i);
            tar+=i;
            dfs(k,n,start+1,tar);
            path.remove(path.size() - 1);
            tar-=i;
        }
    }
}
