package Threads;
class Demo implements Runnable{
    public void run(){
        System.out.println("Inside demo thread executing");
        try{
            Thread.sleep(3000);
            System.out.println("now woke up");
        }catch(Exception e){
            System.out.println("Someproblem");
        

        }
    }
}
public class thread265 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Demo d= new Demo();
        Thread t1= new Thread(d);
        t1.start();

    }
}
