package medium

//Given the root of a binary tree and an integer targetSum, return all root-to-
//leaf paths where the sum of the node values in the path equals targetSum. Each
//path should be returned as a list of the node values, not node references.
//
// A root-to-leaf path is a path starting from the root and ending at any leaf
//node. A leaf is a node with no children.
//
//
// Example 1:
//
//
//Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//Output: [[5,4,11,2],[5,8,4,5]]
//Explanation: There are two paths whose sum equals targetSum:
//5 + 4 + 11 + 2 = 22
//5 + 8 + 4 + 5 = 22
//
//
// Example 2:
//
//
//Input: root = [1,2,3], targetSum = 5
//Output: []
//
//
// Example 3:
//
//
//Input: root = [1,2], targetSum = 0
//Output: []
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 5000].
// -1000 <= Node.val <= 1000
// -1000 <= targetSum <= 1000
//

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func pathSum(root *TreeNode, targetSum int) [][]int {
	result := make([][]int, 0)
	dfs113(root, targetSum, &result, make([]int, 0), 0)
	return result
}

func dfs113(root *TreeNode, targetSum int, result *[][]int, step []int, index int) {
	if root == nil {
		return
	}
	step = append(step, root.Val)
	index += root.Val
	if root.Right == nil && root.Left == nil && index == targetSum {
		temp := make([]int, len(step))
		copy(temp, step)
		*result = append(*result, temp)
		return
	}

	dfs113(root.Left, targetSum, result, step, index)
	dfs113(root.Right, targetSum, result, step, index)

}
