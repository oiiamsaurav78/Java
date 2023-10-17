package Threads;


class Printing implements Runnable{
    public void run(){
        System.out.println("inside printing class--");
        try{
            for(int i=0; i<3;i++){
                System.out.println("focus is importanat");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            System.out.println("Problem");
        }
    }
}
public class thread266 {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread");
        // Printing p new Printing();
        Printing p =new Printing();
        Thread t1= new Thread(p);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        try{
            t1.join();

        }catch(Exception e){
            System.out.println("prblm");
        }
        
        
        System.out.println("Main thread finished");
    
    }
    }