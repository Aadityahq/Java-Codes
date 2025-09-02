// Abstract keyword

abstract class Car //abstract class
{
    public abstract void drive(); // abstract method

    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing music");
    }
}

abstract class Fortuner extends Car
{

    
    public abstract void jump();

    public void drive()
    {
        System.out.println("Driving..");
    }

    public void fly()
    {
        System.out.println("flying..");
    }
}

class FaceliftedFortuner extends Fortuner // concrete class
{
    public void jump()
    {
        System.out.println("Jumping...");
    }
}
public class Lec61
{
    public static void main(String[] args) {
        
        ///Car obj = new Car(); -- can't create object of abstract car class
        
        FaceliftedFortuner obj = new FaceliftedFortuner();
        obj.playMusic();
        obj.drive();
        obj.fly();
        obj.jump();
    
    }
    
}
