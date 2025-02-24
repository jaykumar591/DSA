import java.security.Timestamp;
import java.util.concurrent.TimeoutException;

class A implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print("A ");
        }
    }
    
}

class B implements Runnable{
   public void run(){
    for (int i = 0; i < 10; i++) {
        System.out.print("B ");
    }
   }
}
class D extends Thread{
    public void run(){
        System.out.println("D");
    }
}

class E extends Thread{
    public void run(){
        System.out.println("E");
    }
}

public class nice {

    public static void main(String[] args) {
       Thread thread1 = new Thread(new Runnable() {
        public void run(){
            System.out.println( Thread.currentThread().getName());
            try{Thread.sleep(300);}catch(Exception e){}
        }
       },"apna thread");
       Thread thread2 = new Thread(new Runnable() {
        public void run(){
            System.out.println( Thread.currentThread().getName());
        
        }
       },"meri Thread");
       Thread thread3 = new Thread(new Runnable() {
        public void run(){
            System.out.println( Thread.currentThread().getName());
        }
       },"teri thread");
       thread1.start();
       thread2.start();
       thread3.start();
    }
}