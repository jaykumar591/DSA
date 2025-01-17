package linkedlist;

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class CicularLL {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){ head = tail = newNode;return;}
        tail.next = newNode;
        tail = newNode;
        tail.next = head;


    }

    public void AddPos(int pos, int data) {
        if (pos < 0 || pos > size) return; // Ensure pos is within valid range
    
        if (pos == 0) {
            addFirst(data);
        } else if (pos == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node prev = head;
            for (int i = 0; i < pos - 1; i++) {
                if (prev == null) return; // Safeguard against invalid position
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++; // Update the size
        }
    }
    


    public int size(){
        return size;
    }
    public void addPos(int pos ,int data){
        if(pos == 0){addFirst(data);return;}
        if(pos == size()-1){addLast(data);return;}
        if(pos < 0 || pos > size()){
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        Node prev = head;
        for(int i = 0 ; i < pos - 1 ; i++){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        int data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return data;
    }

    public int removeLast(){
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int data = tail.data;
        if(head == tail){head = tail = null;return data;}
        Node prev = head;   
        for(int i = 0 ; i < size - 2 ; i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
        return data;
    }

    public int remove(int pos){
        if(pos == 0){return removeFirst();}
        if(pos == size()-1){return removeLast();}
        if(pos < 0 || pos > size()){
            System.out.println("Invalid position");
            return -1;
        }
        Node prev = head;
        for(int i = 0 ; i < pos - 1 ; i++){
            prev = prev.next;
        }
        int data = prev.next.data;
        prev = prev.next.next;
        size--;
        return data;

    }
    public int removePos(int pos){
        return remove(pos);
    }

    public int remove(){
        return remove(0);
    }
    public void viewData(){
        if(head==null)return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
            if(temp==head)break;
        }
        System.out.println("null");
    }
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
            if(temp==head)break;
        }
        System.out.println();
    }
    public void printReverce(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
            if(temp==tail)break;
        }
        System.out.println();
    }
    public void viewRef(){
        if(head==null)return;
        Node temp = tail.next;
        while(temp!=tail){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print(head.next.data+"-->");
        System.out.println("null");


    }
}
