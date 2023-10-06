package easy

func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil && l2 == nil {
		return nil
	} else if l1 == nil {
		return l2
	} else if l2 == nil {
		return l1
	}
	if l1.Val < l2.Val {
		return dfs1(l1.Next, l2, l1)
	} else {
		return dfs1(l1, l2.Next, l2)
	}

}
func dfs1(l1 *ListNode, l2 *ListNode, result *ListNode) *ListNode {
	if l1 == nil {
		result.Next = l2
		return result
	} else if l2 == nil {
		result.Next = l1
		return result
	} else {
		if l1.Val > l2.Val {
			result.Next = l2
			return dfs1(l1, l2.Next, result)
		} else {
			result.Next = l1
			return dfs1(l1.Next, l2, result)
		}
	}
}
