package linkedlist;

public class SinglyLinked {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    int size = 0;
    Node head = null;
    Node tail = null;
    public boolean isEmpty(){
        return head == null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            head = newNode ;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addFisrt(int data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            head = newNode ;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            add(data);
            return;
        }

        tail.next  = newNode;
        tail = newNode;
        size++;

    }

    public void addPos(int pos , int data){
        if(pos<0 || pos>=size){
            System.out.println("Invalid index");
            return;
        }
        if(pos==0){
            add(data);
            return;
        }
        if(pos==size-1){
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node prev = head;
        Node temp = head.next;
        while (pos!=1) {
            temp = temp.next;
            prev = prev.next;
            pos--;
        }


        prev.next = newNode;
        newNode.next =  temp;
        size++;
    }

    public int removeFirst(){
        if(head==null)return Integer.MIN_VALUE;
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int removeLast(){
        if(isEmpty())return Integer.MIN_VALUE;
        Node curr = head.next;
        Node prev = head;

        while (curr.next!=null) {
            prev = prev.next;
            curr = curr.next;
        }

        int data = prev.next.data;
        prev.next = curr.next;
        return data;
    }

    public int removePos(int pos){
        if(head==null || pos<0 || pos>=size)return Integer.MIN_VALUE;
        if(pos==0){
            return removeFirst();
        }
        if(pos==size-1){
            return removeLast();
        }

         Node prev = head;
         Node curr = head.next;

         while (pos!=1) {
            curr = curr.next;
            prev = prev.next;
            pos--;
         }
         int data = prev.next.data;
         prev.next = curr.next;
         size--;
         return data;    

    }
    public void view(){
        if(isEmpty())return;

        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // method 
    public void reverse(){
        if(head==null || head.next==null)return;

        Node prev = null;
        Node next = null;
        Node curr = head;
        while (curr!=null ) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public boolean find(int key){
        if (isEmpty()) {
            return false;
        }

        Node temp = head;

        while(temp!=null){
            if(temp.data==key){
                return true;
            }
        }
        return false;
    }

    public int size() {return size;}
    public int getFirst(){return head.data;}
    public int getLast(){return tail.data;}
   
}


