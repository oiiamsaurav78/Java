package Threads;

import java.util.Scanner;

class Mythread1 extends Thread{
    public void run(){
        String tName1=Thread.currentThread().getName();
        if(tName1.equals("Calc4")){
            Calc4();
        }
        else{
            ImportantMessage();
        }

    }
    Scanner sc = new Scanner(System.in);
    public void Calc4(){
        System.out.println("Inside Calcculator");
        System.out.println("Enter 1st no");
        int num1= sc.nextInt();
        System.out.println("Enter 2nd no");
        int num2=sc.nextInt();
        int res= num1+num2;
        System.out.println("result : "+ res);
        System.out.println("------------------------------------------------");

    }
    public void ImportantMessage(){
        System.out.println("Inside Message:");
        for(int i=0;i<3;i++){
            System.out.println("Focus is Important");
        }
        System.out.println("The end");
    }
}
public class thread264 {
    public static void main(String[] args) {
        Mythread1 t1= new Mythread1();
        Mythread1 t2= new Mythread1();
        t1.setName("Calc4");
        t2.setName("PRINT");
       
        t2.start();
         t1.start();
        t1.setPriority(2);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
    }
    
}
