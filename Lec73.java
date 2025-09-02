// Functional Interface





// one way to implement 
@FunctionalInterface
interface X
{
    void callBhai();
}

class B implements X
{
    public void callBhai()
    {
        System.out.println("Hello bhai");
    }
}


public class Lec73 
{
    public static void main(String[] args) 
    {
        X obj1 = new B();
        obj1.callBhai(); // Calling the functional interface using another class which implements it method
        X obj = new X() {
        public void callBhai()
        {
            String bhaiName = "";
            bhaiName = "Adi";
            System.out.println("Kya haaal hai " + bhaiName + " Bhai");
        }
     };  
     
     obj.callBhai(); // This is one way to call functional interface using anonymous inner class
    }
    
}
