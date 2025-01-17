package lineardata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class LinkedList<E>  {

    class Node  {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }

       
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public boolean isEmpty() {
        return tail == null && head == null;
    }
    
    public void add(E data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(E data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void push(E data) {
        addFirst(data);
    }

    public void pushFront(E data) {
        addFirst(data);
    }

    public void pushBack(E data) {
        add(data);
    }

    public void append(E data) {
        add(data);
    }

    public void addLast(E data) {
        add(data);
    }

    public void addPos(int pos, E data) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            addFirst(data);
            return;
        }
        if (pos == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node prev = head;
        for (int i = 1; i < pos; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    public void add(int pos, E data) {
        addPos(pos, data);
    }

    public void insert(int pos, E data) {
        addPos(pos, data);
    }

    public E remove() {
        if (isEmpty()) {
            System.out.println("List is empty, nothing to remove.");
            return null;
        }

        E removedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return removedData;
    }

    public E removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty, nothing to remove.");
            return null;
        }

        E removedData = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            Node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
        }
        size--;
        return removedData;
    }

    public E remove(int pos){
        if(isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        if(pos<0 || pos>size){
            System.out.println("Invalid index");
            return null;
        }
        if(pos==0){
           return remove();
        }
        if(pos==size-1){
            return removeLast();
        }

        Node prev = head;
        Node curr = head.next;
        while (pos!=1) {
            prev = prev.next;
            curr = curr.next;
        }
        E data = prev.next.data;
        prev.next = curr.next;
        size--;
        return data;
    }

    public E delete(){
        return remove();
    }
    public E delete(int pos){
        return remove(pos);
    }
    public E deleteFirst(){
        return remove();
    }
    public E deleteLast(){
        return removeLast();
    }

    public E pop(){
        return remove();
    }
    public boolean removeByValue(E data) {
        if (isEmpty()) {
            System.out.println("List is empty, nothing to remove.");
            return false;
        }
    
        if (head.data.equals(data)) {
            remove();
            return true;
        }
    
        Node prev = head;
        Node curr = head.next;
        while (curr != null && !curr.data.equals(data)) {
            prev = curr;
            curr = curr.next;
        }
    
        if (curr == null) {
            System.out.println("Element not found.");
            return false;
        }
    
        prev.next = curr.next;
        if (curr == tail) {
            tail = prev;
        }
        size--;
        return true;
    }
    public void clear() {
        head = tail = null;
        size = 0;
    }
    
    public E dequeue() {
        return remove();
    }
    public E peek(){
        return head.data;
    }
    public int size(){
        return size;
    }
    public void view(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" , ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void sortData() {
        if(head==null)return;

        ArrayList<E> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }

        for(int i=0; i<list.size(); i++){
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)>== list.get(j));
            }
        }
    }
    
   
    
    
}

