package day_12.multi_threading_1;

/*
 1. Write a Java program to demonstrate multithreading by extending the Thread class.
    --->Create a class MyThread that extends Thread.
    --->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
    --->In the main() method, create two objects of MyThread and start them.
    --->Each thread prints its message independently, showing concurrent execution.
 */

public class ThreadClass {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.setName("First Thread");
        MyThread thread2 = new MyThread();
        thread2.setName("Second Thread");

        thread1.start();
        thread2.start();
    }
}




class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread Name : "+this.getName()+"\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}