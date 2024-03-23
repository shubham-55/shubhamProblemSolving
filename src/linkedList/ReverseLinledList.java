package linkedList;

public class ReverseLinledList {
    ListNode head;

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while (currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {



    }
}
