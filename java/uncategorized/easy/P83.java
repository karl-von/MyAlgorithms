package uncategorized.easy;

public class P83 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){return head;}
        ListNode node = head;
        while (node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }else {
                node = node.next;
            }
        }
//        Stack<medium.ListNode> stack = new Stack<>();
//        stack.push(head);
//        while (stack.peek().next!=null) {
//            medium.ListNode newNode = stack.peek();
//            if (newNode.val == newNode.next.val) {
//                newNode.next = newNode.next.next;
//            } else {
//                stack.push(newNode.next);
//            }
//        }
        return head;
    }

    public static void main(String[] args) {
        P83 p83 = new P83();

        ListNode listNode = new ListNode(1);
        listNode.next=new ListNode(1);
        listNode.next.next=new ListNode(2);
        p83.deleteDuplicates(listNode);
        ListNode node = listNode;
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
