package Multithreading;

class Task1 extends Thread {
    //overriding run method
    public void run(){
        System.out.println("\nTask1 started!");
        for(int i=101;i<199;i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\nTask2 started!");
        for(int i=201;i<299;i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 Done");
    }
}

public class ThreadBasicsRunner {
    public static void main(String[] args){

        //Task1
        System.out.println("\nTask1 kicked off!");
        Task1 task1 = new Task1();
        task1.start(); //after calling start() method start new thread.

        //Task2
        System.out.println("\nTask2 kicked off!");
        Task2 task2 = new Task2();
        Thread thread = new Thread(task2);
        thread.start();

        //Task3
        System.out.println("\nTask3 kicked off!");
        System.out.println("\nTask3 started!");
        for(int i=301;i<399;i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 Done");

        System.out.println("\nMain Done");
    }
}
