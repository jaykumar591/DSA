package threads;

class A implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("A");
        }
    }
}
class B implements Runnable{
    public void run(){
    for (int i = 0; i < 10; i++) {
        System.out.println("B");
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
        D d = new D();
        E e = new E();
        d.start();
        e.start();
    }
}