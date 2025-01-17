package linkedlist;

/**
 * DobulelyLL
 */
public class DoublyLL {

    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.next =null;
            this.prev =null;
            this.data = data;
        }
    }

    private Node head = null;
    private  Node tail = null;
    int size = 0;

    public void addFirst(int data){
        Node nesNode = new Node(data);
        size++;
        if(head==null){
            head = tail = nesNode;
            tail.prev = head;
            return;
        }

        nesNode.next = head;
        head.prev = head;
        head = nesNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addPos(int pos , int data){
        if(head==null || pos<0 || pos>=size){
            return;
        }
        if (pos==0) {
            addFirst(data);
            return;
        }
        if (pos==size-1) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);

        Node prev = head;
        Node curr = head.next;

        while (pos!=1) {
            prev = prev.next;
            curr = curr.next;
        }
        size++;
        prev.next = newNode;
        newNode.prev = prev;
        curr.prev = newNode;
        newNode.next = curr;

    }
    public void view(){
        if(head==null)return;

        Node curr = head;

        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if (head==null) {
            return Integer.MIN_VALUE;
        }
       
        if(head.next==null){
            int data = head.data;
            size--;
            head = tail = null;
            return data;
        }

        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int removeLast(){
        if (head==null) {
            return Integer.MIN_VALUE;
        }
       
        if(head.next==null){
            int data = head.data;
            size--;
            head = tail = null;
            return data;
        }
        int data = tail.data;
        tail.prev = tail;
        size--;
        tail.next = null;
        return data;

    }

    public int removePos(int pos){
        if (head==null)  {
            return Integer.MIN_VALUE;
        }
        if(pos<0 || pos>=size){
            return Integer.MIN_VALUE;
        }

        Node  prev = head;
        Node curr = head.next;

        while (pos!=0) {
            prev = prev.next;
            curr = curr.next;
            pos--;
        }
        int data = prev.next.data;
        prev.next = curr.next;
        curr.next.prev = prev;
        size--;
        return data;
    }

    public void viewReverse(){
        if (head==null) {
            return;
        }

        Node curr = tail;
        while (curr!=null)  {
            System.out.print(curr.data+" ");
            curr = curr.prev;
        }
    }
    

}