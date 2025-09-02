//upcasting and downcasting

class A
{
    public void show1()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }

    public void config() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'config'");
    }
}

public class Lec59 
{
    public static void main(String[] args) 
    {
       A obj = new A(); 
       obj.show1();

       A obj1 = (A) new B(); 
       obj1.show1();  //it is done implicitly ---- upcasting

      // obj1.show2(); //obj1.show2(); // class A does not have the idea what show2() is.

       B obj2 = (B) obj1; // --- DownCasting --  the refrence of to B , as the obj1 is a type of B object
       obj2.show2();
        
       

    }
}
