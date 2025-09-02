class Staticblock{
    static{
        System.out.println("Static Block");
        System.out.println("Executed before main");
    }

    {
        //non static block
        System.out.println("Non static block executed before the execution of constructor");
    }

    public static void main(String []args){
        System.out.println("main method");
         Calc c = new Calc(); //non static block executed when we create object 
         System.out.println(c.add(2,5));
        // Help h ; -- this will not execute static block of Help class
        // Help h = new Help(); this will execute static block of Help class
        Help.wish(); //-- this will execute static block of Help class

    }
}

class Help{
    static {
        System.out.println("Static block of Help class");
    }
    static void wish(){
        System.out.println("Hello");
    }
}
