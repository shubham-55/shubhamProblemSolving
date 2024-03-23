package linkedList;

public class ListImpl {
    ListNode head;

    public void AddAtHead(int val){
        ListNode newnode = new ListNode(val);
        if(head == null){
            head = newnode;
            return;
        }newnode.next = head;
        head = newnode;
    }

    // add last
    public void addLast(int val){
        ListNode newnode = new ListNode(val);
        if(head == null){
            head = newnode;
            return;}
        ListNode currNode = head;
        while (currNode.next!= null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }
    // print
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
        ListNode currNode = head;
        while (currNode != null){
            System.out.println(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    //delete 1st
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
        }
        ListNode currnode = head;
        while (currnode.next!= null){
            currnode = currnode.next;
        }


    }

    public static void main(String[] args) {
        ListImpl list = new ListImpl();
        list.addLast(3);
        list.AddAtHead(4);
        list.printList();
        list.addLast(7);
        list.printList();
    }
}
