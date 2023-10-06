package uncategorized.starter.huisu;

import java.util.ArrayList;
import java.util.List;

public class P131 {
    List<List<String>> lists = new ArrayList<>();
    List<String> paths = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s, 0, "");
        return lists;
    }
    void dfs(String s,int index, String path) {
        if(index>s.length()){
            lists.add(this.paths);
            return;
        }
        for (int i = index; i < s.length(); i++) {
            path+=s.substring(index,i);
            if(path.length()==1||is(path)){
                this.paths.add(path);
                dfs(s,i+1,path);
                path=path.substring(0,path.length()-1);
            }
        }
    }
    boolean is(String path){
        for (int i = 0; i < path.length()/2; i++) {
            if(path.charAt(i)!=path.charAt(path.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
