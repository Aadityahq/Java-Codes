class AddClass
{

    public void show()
    {
        System.out.println("In AddClass show");
    }

    public int add(int a, int b)
    {
        return a + b;
    }
}

class AddSubClass extends AddClass
{
    public void show()
    {
        System.out.println("In AddingClass show");
    }


    public int add(int a, int b, int c)
    {
        return a + b +c;
    }
    public int sub(int a, int b)
    {
        return a - b;
    }
} 



public class Lec55 {
    public static void main(String[] args) {
            AddClass obj = new AddClass();
            System.out.println(obj.add(5, 6)); 

            AddSubClass obj1 = new AddSubClass();
            System.out.println(obj1.add(5, 6, 34));
            
            AddSubClass obj2 = new AddSubClass();
            System.out.println(obj2.sub(5, 6));// compile time 


    }
    
}
