package linkedlist;

public class GenericLL<E> {
    public class Node {
        E data;
        Node next;
    
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
    
    int size = 0;
    Node head = null;
    Node tail = null;
    
    public boolean isEmpty(){
        return head == null;
    }
    @Override
    public String toString(){
        if(isEmpty()){
            return "List is Empty";
        }
        StringBuilder str = new StringBuilder();
        Node temp = head;
        str.append("[ ");
        while (temp!=null) {
            str.append(temp.data).append(" , ");
            temp = temp.next;
        }
        str.append("null");
        str.append(" ]");
        return str.toString();
    }

    public void addFirst(E data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(E data){
        if(isEmpty()){
            addFirst(data);
            return;
        } 
        size++;
        tail.next = new Node(data);
        tail = tail.next;
    }

    public void addPos(int pos, E data){
        if(pos < 0 || pos > size){
            System.out.println("Index invalid");
            return;
        }
        if(pos == size){
            addLast(data);
            return;
        }
        if(pos == 0){
            addFirst(data);
            return;
        }
        size++;
        Node prev = head;
        while(pos > 1){
            prev = prev.next;
            pos--;
        }
        Node curr = prev.next;
        prev.next = new Node(data);
        prev.next.next = curr;
    }
}
