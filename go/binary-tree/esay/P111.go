package esay

//Given a binary tree, find its minimum depth.
//
//The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
//Note: A leaf is a node with no children.

//	type TreeNode struct {
//		Val   int
//		Left  *TreeNode
//		Right *TreeNode
//	}
func minDepth(root *TreeNode) int {
	return minDepth1(root, 0)
}
func minDepth1(root *TreeNode, sum int) int {
	if root.Left == nil && root.Right == nil {
		return sum
	}
	sum++
	if root.Left != nil && root.Right != nil {
		return whoMin(minDepth1(root.Right, sum), minDepth1(root.Left, sum))

	} else if root.Right != nil {
		return minDepth1(root.Right, sum)
	} else {
		return minDepth1(root.Left, sum)
	}

}
func whoMin(l int, r int) int {
	if l <= r {
		return l
	} else {
		return r
	}
}
