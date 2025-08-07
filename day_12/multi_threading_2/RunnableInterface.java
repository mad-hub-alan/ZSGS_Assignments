package day_12.multi_threading_2;

/*
 2. Write a Java program to create a thread using the Runnable interface.
    --->Create a class TaskRunner that implements Runnable.
    --->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
    --->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
    --->The console should reflect the concurrent execution of both tasks.
 */

 
public class RunnableInterface {
    public static void main(String[] args) {
        Runnable display = new TaskRunner("Displaying Movie!");
        Runnable audio = new TaskRunner("Playing Audio!");

        Thread thread1 = new Thread(display);
        thread1.setName("Display");
        Thread thread2 = new Thread(audio);
        thread2.setName("Audio");

        thread1.start();
        thread2.start();
    }
}


class TaskRunner implements Runnable{
    private String task;

    public TaskRunner(String task){
        this.task = task;
    }

    @Override
    public void run() {
        
        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() +" : "+task+"\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
       
    }
}
