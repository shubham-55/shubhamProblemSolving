package linkedList;

public class ListNode {
    int data ;
    ListNode next;

    ListNode(){
        this.data = 0;
        this.next = null;

    }
    ListNode(int data){
        this.data = data;
        this.next = null;

    }

    ListNode(int data,ListNode next){
        this.data = data;
        this.next = next;

    }

}
