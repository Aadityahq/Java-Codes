//Ducking Exception using throws keyword



class DuckingException
{
    
    public void divide() throws ArithmeticException
    {
        int div = 0;
        int num1 = 0;
        int  num2 = 0;
        div = num1 / num2;
       
    }

    public void mul() 
    {
        int mul;
        int num = 2;
        int num1 = 5;
        mul =  num * num1;
        System.out.println(mul);

        try{
            divide();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
            e.printStackTrace();
        }   

    }
}

class A
{
    public void showClass()
    {
         try{
            Class.forName("AbrakaDabra");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Not able to find the given class");
        }
    }
}
    



public class Lec82
{
     static{
            System.out.println("Class Loaded");
        }

    public static void main(String[] args){
        
        A obj = new A();
        obj.showClass();

        DuckingException dException = new DuckingException();

        // try{
        //      dException.divide();
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("The input number are not valid ");
        //     e.printStackTrace();
        // }  
        // finally{      
             dException.mul();
        // } 
    }
}
