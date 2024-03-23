//package linkedList;
//
//public class DoublyLinkedList {
//    ListNode head, tail;
//    int size =0;
//    public void addAtHead(int val){
//        ListNode node = new ListNode();
//        node.data = val;
//        size++;
//
//        if(head == null){
//            head = tail = node;
//        }else {
//            node.next = head;
//            head.prev = node;
//            head = node;
//        }
//    }
//
//    public void addAtTail(int val){
//        ListNode node = new ListNode(val);
//        if(head == null){
//            head = tail = node;
//        }else{
//            ListNode curr = head;
//            while (curr.next != null){
//                curr = curr.next;
//            }
//            curr.next = node;
//            node.prev = curr;
//            tail = node;
//        }
//
//    }
//
//    public ListNode getNode(int idx){
//        if(idx == 0|| idx >= size) return  null;
//
//        ListNode curr = head;
//        for(int i = 0; i<idx;i++){
//            curr = curr.next;
//        }
//        return curr;
//    }
//
//    public void AddAtIndex(int index, int val){
//        if(index ==0 || index>size){
//            addAtHead(val);
//            return;
//        }
//        ListNode node = new ListNode(val);
//        ListNode left = getNode(index-1);
//        ListNode right = left.next;
//        size++;
//        node.prev = left;
//        node.next = right;
//        left.next = node;
//        right.next= node;
//
//    }
//
//    public void deleteHead(){
//        size--;
//        if(size == 0){
//            head = tail = null;
//            return;
//        }
//        head = head.next;
//        head.prev = null;
//    }
//
//    void deleteTail(){
//        size--;
//        if(size == 0){
//            head = tail = null;
//            return;
//        }
//        tail = tail.prev;
//        tail.next = null;
//    }
//}
