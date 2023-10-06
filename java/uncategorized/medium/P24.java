package uncategorized.medium;


import uncategorized.common.ListNode;

public class P24 {
    public ListNode swapPairs(ListNode head) {
        return tool(head);

    }

    private ListNode tool(ListNode head) {
        if (head == null) {
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode next = head.next;
        ListNode nextTwo = next.next;
        next.next = head;
        if (nextTwo != null) {
            head.next = tool(nextTwo);
        }else {
            head.next = null;
        }
        return next;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);

        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        P24 p24 = new P24();
        ListNode l = p24.swapPairs(listNode1);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
