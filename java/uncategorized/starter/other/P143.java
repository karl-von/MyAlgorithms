package uncategorized.starter.other;



import uncategorized.common.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P143 {
    public void reorderList(ListNode head) {
        LinkedList<ListNode> list = new LinkedList<>();
        dfs(head,list);
      while(!list.isEmpty()){
          list.removeFirst().next=list.pollLast();

          list.removeLast().next = list.getFirst();
      }
    }
    void dfs(ListNode head, LinkedList<ListNode> list){
     list.add(head);
        if(head.next==null){
            return;
        }
        dfs(head.next, list);
    }
}
