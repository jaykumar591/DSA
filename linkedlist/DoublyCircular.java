package linkedlist;

public class DoublyCircular {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            head.next = tail;
            head.prev = tail;
            tail.prev = head;
            return;
        }

        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
        tail = newNode;
        size++;
    }

    public void addPos(int pos, int data) {
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
        Node curr = head.next;
        for (int i = 1; i < pos; i++) {
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = curr;
        curr.prev = newNode;
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // Only one node in the list
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // Only one node in the list
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
    }

    public void removePos(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            removeFirst();
            return;
        }
        if (pos == size - 1) {
            removeLast();
            return;
        }

        Node prev = head;
        Node curr = head.next;
        for (int i = 1; i < pos; i++) {
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next.prev = prev;
        size--;
    }

    public void view() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }
}
