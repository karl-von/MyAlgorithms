package uncategorized.medium;



import uncategorized.common.ListNode;

import java.util.Stack;

public class P19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        for (int i = 0; i < n - 1; i++) {
            stack.pop();
        }
        ListNode next = stack.peek();
        if (stack.empty()) {
//            stack.peek() = null;
        } else {
            ListNode front = stack.peek();
            front.next = next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        P19 p19 = new P19();
        ListNode listNode = new ListNode(1);
        p19.removeNthFromEnd(listNode, 1);
    }
}
