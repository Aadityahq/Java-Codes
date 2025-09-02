//Anonymous Object 

class A
{

    public void show()
    {
        System.out.println("In a show method");
    }
}

public class Lec46 
{
    public static void main(String[] args) 
    {
        
        A obj = new A();//object is created using reference variable
        obj.show();

        A obj1;  
        obj1 = new A(); // object created , got a reference variable, assigning the value to obj
        obj1.show();

        new A(); // Anonymous Object 
        new A().show();
    }
}
