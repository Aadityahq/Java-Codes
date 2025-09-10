//Threads 


class ThreadA extends Thread
{
    public  void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Hi");
        }
    }
}

class ThreadB extends Thread{
    public void run()
    {
       
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Hello");
        }
    }
}

public class Lec85 {
    public static void main(String[] args) throws InterruptedException {

        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        
     
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Thread running completed");
        
        
        
    }
}
