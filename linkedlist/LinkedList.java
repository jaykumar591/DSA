package linkedlist;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void add(int pos, int data) {
        if (pos > size || pos < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (pos == 0) {
            add(data);
            return;
        }
        if (pos == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node prev = head;
        Node curr = head.next;

        while (pos != 1) {
            prev = prev.next;
            curr = curr.next;
            pos--;
        }
        size++;
        prev.next = newNode;
        newNode.next = curr;
    }

    public void addLast(int data) {
        if (isEmpty()) {
            add(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public int remove() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        size--;
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public void addFirst(int data) {
        add(data);
    }

    public int removeLast() {
        if (isEmpty()) return Integer.MIN_VALUE;
        if (head.next == null) {
            int data = head.data;
            size--;
            head = tail = null;
            return data;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr.next != null) {
            prev = prev.next;
            curr = curr.next;
        }
        size--;
        int data = curr.data;
        prev.next = null;
        tail = prev;
        return data;
    }

    public int remove(int pos) {
        if (pos >= size || pos < 0) return Integer.MIN_VALUE;
        if (pos == 0) {
            return remove();
        }
        if (pos == size - 1) return removeLast();

        Node prev = head;
        Node curr = head.next;

        while (pos != 1) {
            prev = prev.next;
            curr = curr.next;
            pos--;
        }
        int data = curr.data;
        prev.next = curr.next;
        if (curr == tail) {
            tail = prev;
        }
        size--;
        return data;
    }

    public boolean search(int data) {
        if (isEmpty()) return false;
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean searchR(Node curr, int data) {
        if (curr == null) return false;
        if (curr.data == data) return true;
        return searchR(curr.next, data);
    }

    public void reverse() {
        if (head == null || head.next == null) return;
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        if (tail != null) {
            tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
        }
    }

    public boolean setFirst(int data) {
        if (head == null) {
            return false;
        }
        head.data = data;
        return true;
    }

    public boolean setLast(int data) {
        if (tail == null) {
            return false;
        }
        tail.data = data;
        return true;
    }

    public boolean setPos(int pos, int data) {
        if (pos >= size || pos < 0)
            return false;
        if (pos == 0) {
            return setFirst(data);
        }
        if (pos == size - 1) {
            return setLast(data);
        }

        Node curr = head;

        while (pos != 0) {
            curr = curr.next;
            pos--;
        }
        curr.data = data;
        return true;
    }

    public int findMid(){
        if(head==null){
            return Integer.MIN_VALUE;
        }

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next !=null) {
            slow =slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
    
    public void view(){
        if (head==null) {
            System.out.println("Empty");
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(" null");

    }
}
