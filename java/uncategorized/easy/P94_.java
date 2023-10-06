package uncategorized.easy;



import uncategorized.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P94_ {


    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null){
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
}
