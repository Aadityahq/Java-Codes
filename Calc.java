// Static block


class Calc{
    // This is static block
    static{
        System.out.println("Static Block");
        System.out.println("Executed before main");
    }

    {
        //non static block
        System.out.println("Non static block executed before the execution of constructor");
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

     public int sub(int n1, int n2)
    {
        return n1 - n2;
    }

    public static void main(String []args){
        System.out.println("main method");
        Calc c = new Calc(); //non static block executed when we create object 
       
        System.out.println( c.add(1,4));
         // Help h ; // this will not execute static block of Help class, here we dont need the help class thats why it doesn't execute
        //Help h = new Help(); //this will execute static block of Help class

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
