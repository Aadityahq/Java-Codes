// final keyword

final class A
{

    final int age = 90;
    final public void show()
    {
        System.out.println("In class A show method");
    }
}

// class B extends A -- cannot extend the final class
// {
//     // public void show() -- cannot override the final method
//     // {
//     //     System.out.println("In B show");
//     // }
// }

public class Lec57
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

        // obj.age = 89; -- cannot assigned the final variable
        
    }
    
}
