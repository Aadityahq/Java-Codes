//Multiiple Threads 

class ThreadA implements Runnable
{
    public  void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Hi");
        }
    }
}

class ThreadB implements Runnable
{
    public void run()
    {
       
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Hello");
        }
    }
}


public class Lec86 {
    public static void main(String[] args) throws InterruptedException
    {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        
        t1.start();
        t2.start();

        t1.join();
        t2.wait(6);

        System.out.println("Thread running completed");
    }
    
}
