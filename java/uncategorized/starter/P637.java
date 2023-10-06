package uncategorized.starter;




import uncategorized.common.TreeNode;

import java.util.*;

public class P637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode one = queue.poll();
                sum += one.val;
                if(one.left!=null){
                    queue.offer(one.left);
                }
                if(one.right!=null){
                    queue.offer(one.right);
                }
            }
            list.add(sum/size);
        }

        return list;
    }
}
