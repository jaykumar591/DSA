
class LL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    
        Node(Node obj){
            next = obj;
        }
    }

    Node head = null;
    Node tail = null;

    public LL add(int data){
        if(head==null){
            head = tail = new Node(data);
            return this;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head= newNode;
        return this;
    }

    public void view(){
        if(head==null)return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(9).add(10).add(11).add(12).add(14).view();
    }
}
