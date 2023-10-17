package Threads;

import java.util.Scanner;

class Calc extends Thread{
    public void run(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your 1st no:");

        int num1= input.nextInt();
        System.out.println("Enter your 2nd no: ");
        int num2= input.nextInt();
        int res= num1+num2;
        System.out.println(res);
        System.out.println("calculation done");
    }
    

}
class Message extends Thread {
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

public class thread260 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Calc t1= new Calc();
        Message t2= new Message();
        t1.start();
        t2.start();

        

    }
}
