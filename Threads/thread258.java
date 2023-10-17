package Threads;

public class thread258 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        // Thread is an Static method so no need to make  object of thread to call it
        String name=Thread.currentThread().getName();
        System.out.println(name);
        int priorityThread= Thread.currentThread().getPriority();
        System.out.println(priorityThread);
        System.out.println("--------------------After changing name and Priority---------------------");
        Thread t= Thread.currentThread();
        t.setName("Main thread2");
        t.setPriority(1);
        String name1=Thread.currentThread().getName();
        int num2= Thread.currentThread().getPriority();
        System.out.println("THe name of main thread has been changed"+name1);
        System.out.println(num2);

    }
}
