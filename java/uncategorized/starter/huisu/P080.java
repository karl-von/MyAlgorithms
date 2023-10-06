package uncategorized.starter.huisu;



import java.util.*;

public class P080 {


    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        dfs(n,k,1,path);
        return lists;
    }
    void dfs(int n, int k,int start,List<Integer> path){
        if(path.size()==k){
            lists.add(new ArrayList<>(path));
            return;
        }
        for(int i = start;i <= n;i++){
            path.add(i);
            dfs(n,k,i+1,path);
            path.remove(path.size()-1);
        }
    }

}
