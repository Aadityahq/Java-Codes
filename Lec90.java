// Thread States


public class Lec90 {
    public static void main(String[] args) {
        
        Counter c = new Counter();

        Runnable r1 = () ->
        {
                for(int i = 0; i < 1000; i++)
                    {
                        c.increament();
                        
                    }
            
        }; //Here thread is in running state

         Runnable r2 = () ->
         {
                for(int i = 0; i < 1000; i++)
                    {
                       c.increament();
                    }
            
        };

        Thread t1 = new Thread(r1); /// New state
        Thread t2 = new Thread(r2);

        
        t1.start(); //Runnable state
        
        t2.start();

        try {
            t1.join(); // Waiting state for main
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        System.out.println(c.count);
    }
    

}

