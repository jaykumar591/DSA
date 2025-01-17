import java.util.LinkedList;
import java.util.Queue;

public class StacksingTwoQueue {
    static  class Stack{
        Queue<Integer> base = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();

        public void push(int data){
            if(base.size()<=0){
                base.add(data);
                return;
            }
            while(!base.isEmpty()){
                temp.add(base.remove());
            }
            base.add(data);
            while (!temp.isEmpty()) {
                base.add(temp.remove());
            }
        }
        public int pop(){
            return base.remove();
        }
        public int peek(){
            return base.peek();
        }
        public boolean isEmpty(){
            return base.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(20);
        s.push(21);
        s.push(22);
        s.push(23);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
