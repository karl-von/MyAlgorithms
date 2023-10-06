package uncategorized.medium;



import uncategorized.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int index = 0;
        List<ListNode> list = new ArrayList<>();
        ListNode l11 = l1;
        ListNode l22 = l2;
        while (l11 != null || l22 != null) {
            int i = index;
            if (l11 != null) {
                i += l11.val;
            }
            if (l22 != null) {
                i += l22.val;
            }
            index = 0;
            if (i >= 10) {
                index++;
                i = i - 10;
            }
            list.add(new ListNode(i));
            if (l11 != null) {
                l11 = l11.next;
            }
            if (l22 != null) {
                l22 = l22.next;
            }
        }
        if (index != 0) {
            list.add(new ListNode(1));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        return list.get(0);
    }
}
