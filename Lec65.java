// Interface


    
interface A
{
    int price = 100;        // Final & static -- by default 
    String brand = "BMW";

    void drive();
    void playMusic();
}

class Car implements A
{
    public void drive()
    {
        System.out.println("Car drives");
    }

    public void playMusic()
    {
        System.out.println("Music is playing...");
    }
}
public class Lec65 
{
    public static void main(String[] args) {
        
        Car obj = new Car();

        // System.out.println(obj.price);
        // System.out.println(obj.brand); // accesing using object

        System.out.println(A.price);
        System.out.println(A.brand); // variable acceses by the interface in static way without creating object 

        obj.drive();
        obj.playMusic();
    }

}
