package stack;
class Stack{
    int capacity;
    int lastIndex = -1;
    int arr[];
    Stack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public boolean isFull(){
        return lastIndex == capacity-1;
    }

    public void push(int data){
        if(lastIndex==capacity){
            System.out.println("OutOfBound");
            return;
        }
        if(lastIndex==capacity-1){
            System.out.println("Stack is Full");
            return;
        }
        lastIndex++;
        arr[lastIndex] = data;
    }
    public int pop(){
        if(lastIndex==-1){
            return Integer.MIN_VALUE;
        }

        int data = arr[lastIndex];
        arr[lastIndex] = 0;
        lastIndex--;
        return data;
    }
    public int peek(){
        if(lastIndex==-1){
            return Integer.MIN_VALUE;
        }
        return arr[lastIndex];
    }

}
public class StackUsingArray {
    
}
