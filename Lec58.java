//object class

class Laptop extends Object
{
    int price;
    String model;
    String serial;


    public void show()
    {
        System.out.println("In A show");
    }

    public String toString()
    {
        return "Hey";
    }

    public boolean equals(Laptop that)
    {
        return this.model.equals(that.model) && this.price == that.price;    
    }

    
}

public class Lec58 
{
    public static void main(String[] args)
    {
        
        Laptop obj = new Laptop();
        obj.model = "MacBook Air M1";
        obj.price = 100;

        Laptop obj1 = new Laptop();
        obj1.model = "MacBook Air M2";
        obj1.price = 150;

        System.out.println(obj.toString());

        boolean result = obj.equals(obj1);
        System.out.println(result);

    }
}
