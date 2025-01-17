package queue;

class Queue{
    int capacity;
    int rear =-1;
    int arr[];
    Queue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }
    public boolean isFull = capacity-1==rear;
    public boolean isEmpty = rear==-1;
    public void add(int data) {

        if(isFull){
           System.out.println("OutOfBound");
           return; 
        }
        rear++;
        arr[rear] = data;
    }
    public  int peek(){
        if(isEmpty)return -1;
        return arr[0] ;     
    }

    public int pop(){
        if(isEmpty)return -1;
        int data = arr[rear];

        rear--;
        return data;
    }
}

public class UsingArray {
    
}
