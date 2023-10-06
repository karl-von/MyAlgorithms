package uncategorized.starter;


import uncategorized.common.TreeNode;

public class P236 {
    TreeNode node = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (node!=null){
            return node;
        }
        if(root==null) {
            return null;
        }

        if (root == p ){
            return p;
        }
        if(root == q){
            return q;
        }
        TreeNode q1 = lowestCommonAncestor(root.left, p, q);
        TreeNode p1 = lowestCommonAncestor(root.right, p, q);
        if(q1!=null&&p1!=null){
            node = root;
        }
        return node;
    }
}
