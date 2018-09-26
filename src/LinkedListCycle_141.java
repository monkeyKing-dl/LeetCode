/**
 * Created by daili on 2018/9/22.
 */
public class LinkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        if(head.next == null){
            return false;
        }
        ListNode firstNode = head;
        ListNode secondNode = head;
        while (head != null && secondNode != null){
            if(firstNode == secondNode){
                return true;
            }
            //ListNode tempNode = secondNode;
            firstNode = firstNode.next;
            secondNode = secondNode.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        LinkedListCycle_141 linkedListCycle141 = new LinkedListCycle_141();
        linkedListCycle141.hasCycle(root);
    }
}
