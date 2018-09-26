/**
 * Created by daili on 2018/9/24.
 */
public class OddEvenLinkedList_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode tempOdd = head;
        ListNode tempEven = head.next;
        while (tempOdd !=null && tempEven!=null&&tempOdd.next != null && tempEven != null){
            tempOdd.next = tempEven.next;
            tempOdd = tempOdd.next;
            tempEven.next = tempOdd.next;
            tempEven = tempEven.next;
        }
        tempOdd.next = even;
        return odd;
    }
}
