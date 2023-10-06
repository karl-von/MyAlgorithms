package esay

//Given the root of a binary tree, check whether it is a mirror of itself (i.e.,
// symmetric around its center).
//
//
// Example 1:
//
//
//Input: root = [1,2,2,3,4,4,3]
//Output: true
//
//
// Example 2:
//
//
//Input: root = [1,2,2,null,3,null,3]
//Output: false
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [1, 1000].
// -100 <= Node.val <= 100
//
//
//
//Follow up: Could you solve it both recursively and iteratively?
//

func isSymmetric(root *TreeNode) bool {
	if root.Right == nil && root.Left == nil {
		return true
	} else if root.Right == nil || root.Left == nil {
		return false
	}
	return isSymmetric1(root.Left, root.Right)
}
func isSymmetric1(left *TreeNode, right *TreeNode) bool {
	if right == nil && left == nil {
		return true
	} else if right == nil || left == nil {
		return false
	} else if right.Val != left.Val {
		return false
	} else if !isSymmetric1(right.Left, left.Right) {
		return false
	} else if !isSymmetric1(left.Left, right.Right) {
		return false
	} else {
		return true
	}
}
