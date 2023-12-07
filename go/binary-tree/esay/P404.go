package esay

//Given the root of a binary tree, return the sum of all left leaves.
//
// A leaf is a node with no children. A left leaf is a leaf that is the left
//child of another node.
//
//
// Example 1:
//
//
//Input: root = [3,9,20,null,null,15,7]
//Output: 24
//Explanation: There are two left leaves in the binary tree, with values 9 and 1
//5 respectively.
//
//
// Example 2:
//
//
//Input: root = [1]
//Output: 0
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [1, 1000].
// -1000 <= Node.val <= 1000
//

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func sumOfLeftLeaves(root *TreeNode) int {
	return dfs404(root, false, 0)
}
func dfs404(root *TreeNode, isLeft bool, result int) int {
	if root == nil {
		return result
	}
	if root.Left == nil && root.Right == nil {
		if isLeft {
			return result + root.Val
		}
		return result
	}
	result = dfs404(root.Left, true, result)

	result = dfs404(root.Right, false, result)

	return result
}
