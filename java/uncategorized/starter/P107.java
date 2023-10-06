package uncategorized.starter;





import uncategorized.common.TreeNode;

import java.util.*;

public class P107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
           return list;
       }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list1 = new ArrayList<>();
            for(int i = 0; i < size; i++){
                list1.add(queue.poll().val);
                if(root.left!=null){
                    queue.offer(root.left);
                }
                if(root.right!=null){
                    queue.offer(root.right);
                }
            }
            list.add(list1);
        }
        Collections.reverse(list);
        return list;
    }
}
