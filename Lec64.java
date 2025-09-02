// Anonymous Class

abstract class Car 
{
    public abstract  void drive();

    public abstract void speed();
}



public class Lec64 
{
   public static void main(String[] args) {
    
    Car obj = new Car() 
    {
        public void drive()
        {
            System.out.println("Car can be drive");
        }

        public void speed()
        {
            System.out.println("Car can speed up");
        }
    }; // Anonymous class

    obj.drive();
    obj.speed();
   } 
}
