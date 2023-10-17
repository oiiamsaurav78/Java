package Threads;
class MyThreads extends Thread
{
    public void run(){
        System.out.println("Child Thread");
    }
}
public class thread259 {
    public static void main(String[] args) {
        MyThreads t= new MyThreads();
        // t.start();
        t.run();
    }
}
