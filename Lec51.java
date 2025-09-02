// use of this() & super() keyword

class A extends Object
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int num)
    {
        this(); // call default constructor
        System.out.println("in A int");
    }
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}

 class B extends A
 {   
    public B()
    {
        // super(); -- here it is presennt by default
        System.out.println("in B");
    }
    public B(int num)
    {
      
        super(8);
        System.out.println("in B int");
    }
}


public class Lec51 
{
    public static void main(String[] args) 
    {
        // A obj = new A();

        // A obj1 = new A(8);

        B obj2 = new B();

        B obj3 = new B(8);


    }

}
