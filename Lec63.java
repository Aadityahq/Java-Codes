// Anonymous Inner Class

class Car{


    public void drive()
    {
        System.out.println("Car is Driving");
    }
}


public class Lec63 {
    public static void main(String[] args) {

        Car obj = new Car()
        {
            public void drive()
            {
                System.out.println("Car drives");
            }
        }; /// anonymous class - override the drive() from enclosing class

        obj.drive();
        
    }
    
}
