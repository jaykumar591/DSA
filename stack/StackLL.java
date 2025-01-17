package stack;

public class StackLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    int size = 0;
    Node head = null;
    public boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        size++;
        if(head==null){
            head = new Node(data);
            return ;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop (){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return head.data;
    }
}
