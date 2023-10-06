package uncategorized.starter;



import uncategorized.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class P102 {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return list;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.remove();
                list.add(t.val);
                if (t.left!=null){
                    queue.add(t.left);
                }
                if (t.right!=null){
                    queue.add(t.right);
                }
            }
            this.list.add(list);
        }
        return list;
    }
}
