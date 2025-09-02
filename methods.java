



class Car
{
    public void wheel()
    {
        System.out.println("Wheels added");
    }

    public void machine()
    {
        System.out.println("Machine added");
    }

    public int price(int cost)
    {
        System.out.print("Cost of a car: ");
        return cost;
    }
}



public class methods {
    
    public static void main(String args[])
    {
        System.out.println("Add wheels to the car");
        Car c1 = new Car();
        c1.wheel();

        c1.machine();

        int carCost = c1.price(1000000);
        System.out.println(carCost);

    }
}
