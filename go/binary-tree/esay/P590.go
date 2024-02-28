package esay

//Given the root of an n-ary tree, return the postorder traversal of its nodes'
//values.
//
// Nary-Tree input serialization is represented in their level order traversal.
//Each group of children is separated by the null value (See examples)
//
//
// Example 1:
//
//
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [5,6,3,2,4,1]
//
//
// Example 2:
//
//
//Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,
//null,12,null,13,null,null,14]
//Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 10⁴].
// 0 <= Node.val <= 10⁴
// The height of the n-ary tree is less than or equal to 1000.
//
//
//
// Follow up: Recursive solution is trivial, could you do it iteratively?
//

type Node struct {
	Val      int
	Children []*Node
}

func postorder(root *Node) (result []int) {
	dfs590(root, &result)
	return
}

func dfs590(root *Node, result *[]int) {
	if root == nil {
		return
	}
	for _, child := range root.Children {
		dfs590(child, result)
	}
	*result = append(*result, root.Val)
}

//  Success:
//	Runtime:0 ms, faster than 100.00% of Go online submissions.
//	Memory Usage:3.8 MB, less than 72.41% of Go online submissions.
