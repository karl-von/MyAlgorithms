package easy

func reverseList(head *ListNode) *ListNode {
	_, end := dfs(head)
	head.Next = nil
	return end
}
func dfs(head *ListNode) (h *ListNode, end *ListNode) {
	if head.Next == nil {
		end = head
		return head, end
	}
	newHead := reverseList(head.Next)
	newHead.Next = head
	return head, end
}
