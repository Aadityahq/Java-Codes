//Race condition in java --ek resource ko kab multiple threds use aur change krne ke liye race krte hai

 class Counter 
 {
    int count =0;
    public synchronized void increament() /// Shared Resource accessed by the thread
    {        
        count ++;
    }

 }


public class Lec89 {
    public static void main(String[] args) throws InterruptedException{

        Counter c = new Counter();

        Runnable r1 = () ->
        {
                for(int i = 0; i < 1000; i++)
                    {
                        c.increament();
                        
                    }
            
        };

         Runnable r2 = () ->
         {
                for(int i = 0; i < 1000; i++)
                    {
                       c.increament();
                    }
            
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        
        t1.start();
        
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        System.out.println(c.count);
    }
    
}
