/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode findHalf(ListNode head){
        ListNode temp= head;
        int count=0;
        while(temp!=null){
            count++;
            temp= temp.next;
        }

        count/=2;
        temp= head;

        for(int i=0; i < count - 1; i++){
            temp= temp.next;
        }

        ListNode head2= temp.next;
        temp.next= null;

        return head2;
    }

    public ListNode reverse(ListNode head, ListNode prev){
        if(head == null) return prev;
        ListNode nextNode= head.next;
        head.next= prev;
        return reverse(nextNode, head);
    }

    public void reorderList(ListNode head) {
        // find middle half of list
        ListNode head2= findHalf(head);

        // reverse second half of list
        head2= reverse(head2, null);

        // merging the 2 lists
        ListNode dummy= new ListNode(-1);
        ListNode first= dummy;

        while(head != null && head2 != null){
            dummy.next= head;
            head= head.next;
            dummy= dummy.next;

            dummy.next= head2;
            head2= head2.next;
            dummy= dummy.next;
        }

        dummy.next= head2;
        head= first.next;
    }
}