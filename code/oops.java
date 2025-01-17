package code;

public class oops {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        Counter.displayCount();
    }

    
}
class Counter{
   static int count;
   Counter(){
    count++;
   }
   static void displayCount(){
    System.out.println("the value of count is:"+count);
   } 
}
