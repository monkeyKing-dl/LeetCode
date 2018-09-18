/**
 * Created by daili on 2018/9/18.
 */

  //Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1 ;
        ListNode tempListNode = head;
        while (tempListNode.next != null){
            size++;
            tempListNode = tempListNode.next;
        }
        int target = size-n+1;
        size = 1;
        tempListNode = head;
        if(tempListNode.next == null && n == 1){
            return null;
        }
        while (tempListNode.next != null){
            if(size == target-1){
                tempListNode.next = tempListNode.next.next;
                break;
            }
            tempListNode = tempListNode.next;
            size++;
        }
        return head;
    }

    public static void main(String[] args) {
       ListNode firstNode = new ListNode(1);
        firstNode.next = new ListNode(2);
//        firstNode.next.next = new ListNode(3);
//        firstNode.next.next.next = new ListNode(4);
//        firstNode.next.next.next.next = new ListNode(5);
        removeNthFromEnd(firstNode,2);
    }
}
