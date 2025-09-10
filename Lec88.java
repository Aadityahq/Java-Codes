//Try to optimise the thread



public class Lec88 {
    public static void main(String[] args) throws InterruptedException{
        Runnable r1 = () ->
        {
                for(int i = 0; i < 100; i++)
                    {
                        try {
                            Thread.sleep(4);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.println("Hi");
                    }
            
        };

         Runnable r2 = () ->
         {
                for(int i = 0; i < 100; i++)
                    {
                         try {
                            Thread.sleep(4);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.println("Hello");
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        System.out.println("Thread run completed");
    }
    
}
