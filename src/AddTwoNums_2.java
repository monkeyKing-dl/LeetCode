/**
 * Created by daili on 2018/7/28.
 */
public class AddTwoNums_2 {


     static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(2);
        firstNode.next = new ListNode(4);
        firstNode.next.next = new ListNode(3);

        ListNode secondNode = new ListNode(5);
        secondNode.next = new ListNode(6);
        secondNode.next.next = new ListNode(4);

        ListNode resultList = addTwoNumbers(firstNode,secondNode);

        while (resultList.next != null){
            System.out.println(resultList.val);
            resultList = resultList.next;
        }
        System.out.println(resultList.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = null;
        int jinwei = 0;
        int resultL1 = 0;
        int resultL2 = 0;
        int totalNum = 0;
        ListNode headNode = null;
        while (l1!=null||l2!=null||jinwei!=0){
             resultL1 = 0;
            if(l1!=null){
                resultL1 = l1.val;
                l1 = l1.next;
            }
             resultL2 = 0;
            if(l2!=null){
                resultL2 = l2.val;
                l2 = l2.next;
            }
            totalNum = resultL1+resultL2+jinwei;
            int result = totalNum%10;
            jinwei = totalNum/10;
            if(resultNode == null){
                resultNode = new ListNode(result);
                headNode = resultNode;
            }else {
                resultNode.next = new ListNode(result);
                resultNode = resultNode.next;
            }
        }
        return headNode;
    }

}
