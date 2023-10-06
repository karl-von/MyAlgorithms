package uncategorized.starter.huisu;


import uncategorized.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P257 {
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root.left,root.val+"");
        dfs(root.right,root.val+"");
        return list;
    }
    public void dfs(TreeNode root,String path){
        if(root.left==null&&root.right==null){
            list.add(path);
        }else{
            path+=("->"+root.val);
            dfs(root.left,path);
            dfs(root.right,path);
        }
    }
}
