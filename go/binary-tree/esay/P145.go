package esay

// Given the root of a binary tree, return the postorder traversal of its nodes'
// values.
//
// Example 1:
//
// Input: root = [1,null,2,3]
// Output: [3,2,1]
//
// Example 2:
//
// Input: root = []
// Output: []
//
// Example 3:
//
// Input: root = [1]
// Output: [1]
//
// Constraints:
//
// The number of the nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100
//
// Follow up: Recursive solution is trivial, could you do it iteratively?
func postorderTraversal(root *TreeNode) []int {
	result := make([]int, 0)
	result = dfs(root, result)
	return result
}
func dfs(root *TreeNode, result []int) []int {
	if root == nil {
		return result
	}
	dfs(root.Left, result)
	dfs(root.Right, result)
	result = append(result, root.Val)
	return result
}
