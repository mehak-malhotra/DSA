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
    public Node insertAtBeginning(Node tail, int key) {
        Node nextNode= tail.next;
        Node newNode= new Node(key);
        tail.next= newNode;
        newNode.next= nextNode;
        return newNode;
    }
}