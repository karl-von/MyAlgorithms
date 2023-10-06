package uncategorized.starter.huisu;

import java.util.ArrayList;
import java.util.List;

public class P22 {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String path = "";
        dfs(n,0,0, path);
        return list;
    }
    public void dfs(int n,int left,int right, String path){
        if(left == n&& right == n){
            list.add(path);
        }else{
            if(left<n){
                dfs(n,left+1,right,path+"(");
            }
            if(right<n&&left>right){
                dfs(n,left,right+1,path+")");
            }
        }
    }
}
