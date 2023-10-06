package easy

func deleteNode(head *ListNode, val int) *ListNode {
	node := head
	next := head.Next
	if next == nil {
		node.Next = nil
		return node
	}
	for true {
		if next.Val == val {
			node.Next = next.Next
			break
		}
	}
	return head
}
