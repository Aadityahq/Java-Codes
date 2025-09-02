// Polymorphism

class A
{
    public void show()
    {
        System.out.println("In A show");
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

class B  extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("In C show");
    }
    public int mul(int n1, int n2)
    {
        return n1 * n2;
    }

}


public class Lec56 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();
        System.out.println(obj.add(3, 5));

        //dynamic method dispatch -- assigning the object to the same ref variable of parent class
        obj = new B();
        obj.show();
        System.out.println(obj.add(17, 5));

        obj = new C();
        obj.show();
        System.out.println(obj.add(34, 5));



    }
}
