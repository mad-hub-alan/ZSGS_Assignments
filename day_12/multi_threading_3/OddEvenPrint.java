package day_12.multi_threading_3;

/*
 3. Write a Java program where one thread prints only even numbers and 
 another prints only odd numbers from 1 to 20. Synchronize the threads 
 so that they print alternately (i.e., 1 2 3 4 ...)
 */

public class OddEvenPrint {
    public static void main(String[] args) {

        Printer print = new Printer();

       Thread thread1 = new Thread(){
            @Override
            public void run() {
                try{
                    print.oddPrint();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            };
       };
       Thread thread2 = new Thread(){
            @Override
            public void run() {
                try{
                    print.evenPrint();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            };
       };

       thread1.setName("Odd Thread");
       thread2.setName("Even Thread");

       thread1.start();
       thread2.start();

    }
}

class Printer{
    static int count = 1;
    
    public synchronized void oddPrint(){
        while(count <= 20){
            if(count %2 != 0){
                System.out.println(Thread.currentThread().getName() +"  : "+count+"\n");
                count++;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public synchronized void evenPrint(){
        while(count <= 20){
            if(count %2 == 0){
                System.out.println(Thread.currentThread().getName() +" : "+count+"\n");
                count++;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


