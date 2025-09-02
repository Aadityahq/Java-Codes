//Inner Class

class A
{
    int age;
    String name;

    public void show()
    {
        System.out.println("In A show");
    }

    class B 
    {
        public void config()
        {
            System.out.println("In config..");
        }
    }
}

public class Lec62 
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); // for creating B class object we need outer class object although we can declare it without outer class object
        obj1.config();
    }
}
