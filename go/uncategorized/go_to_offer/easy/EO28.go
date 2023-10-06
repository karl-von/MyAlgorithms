package easy

func isSymmetric(root *TreeNode) bool {
	if root == nil {
		return true
	}
	return isSymmetric2(root.Left, root.Right)
}
func isSymmetric2(l *TreeNode, r *TreeNode) bool {
	if l == nil && r == nil {
		return true
	} else if l == nil || r == nil {
		return false
	} else if l.Val != r.Val {
		return false
	} else {
		return isSymmetric2(l.Left, r.Right) && isSymmetric2(l.Right, r.Left)
	}
}
