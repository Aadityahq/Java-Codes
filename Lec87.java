//Creating Thread using Runnable interface



public class Lec87 {
    public static void main(String[] args) throws InterruptedException{
        Runnable r1 = new Runnable()
        {
            public void run()
            {
                for(int i = 0; i < 100; i++)
                    {
                        System.out.println("Hi");
                    }
            }
        };

         Runnable r2 = new Runnable()
        {
            public void run()
            {
                for(int i = 0; i < 100; i++)
                    {
                        System.out.println("Hello");
                    }
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
       

        System.out.println(t1.getPriority());
        t2.setPriority(10);

        Thread.sleep(200);

        System.out.println(t2.getPriority());

        System.out.println("Thread run completed");
    }
    
}
