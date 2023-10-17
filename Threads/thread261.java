package Threads;
import java.util.*;
import java.util.Scanner;

class Calc3 implements Runnable{
    public void run(){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your 1st no: ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int res= num1+num2;
        System.out.println("the result is: "+ res);

    }

    
   // System.out.println("Enter your 1st no: ");
}
class Message3 implements Runnable{
    public void run(){
        try{
        for(int i=0; i<3;i++){
            System.out.println("Focus is important");
            Thread.sleep(2000);
            }
       }
       catch(Exception e){
        System.out.println("exception");
       }
       
        System.out.println("message sent");
    }
}

public class thread261 {
    public static void main(String[] args) {
        Message m3= new Message();
        Calc3 c3= new Calc3();
        Thread t1= new Thread(m3);
        Thread t2= new Thread(c3);
        t1.start();
        t2.start();
        
    }
}
