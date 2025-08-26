/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        if(head == null || head.next == null) return 0;
        
        Node slow= head;
        Node fast= head;
        
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow == fast){
                int len= 1;
                fast= fast.next;
                while(fast != slow){
                    fast= fast.next;
                    len++;
                }
                return len;
            }
        }
        
        return 0;
    }
}