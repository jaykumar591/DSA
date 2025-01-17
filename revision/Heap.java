import java.util.Collections;

class Node implements Comparable<Node> {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        
        this.next = null;
    }

    public int compareTo(Node other){
        return this.data - other.data;
    }
}

class LL{
    Node head = null;
    Node tail = null;

    public void add(int data){
        if(head==null) {head = tail = new Node(data); return;}
        Node newNode = new Node(data);
        newNode.next = head;
        head= newNode;
    }

    public void view(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Heap{
    public static void main(String[] args) {
        LL ll = new LL();

        ll.add(324);
        ll.add(324);
        ll.add(23);
        Collections.sort(ll);
    }
}