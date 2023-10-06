package uncategorized.easy;


import uncategorized.common.TreeNode;

public class P100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (q == null && p != null)) {
            return false;
        } else if (q == null && p == null) {
            return true;
        } else {
            if (q.val == p.val) {
                return isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
            }else {
                return false;
            }
        }
    }
}
