//Comparable interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car2 implements Comparable<Car2>
{
    String name;
    int price;

    @Override
    public String toString() {
        return "Name : " + name +  " | " + "Price : " + price ;
    }



    public Car2(int price, String name)
    {
        this.price = price;
        this.name = name;

    }

  

    @Override
    public int compareTo(Car2 that) 
    {
        if(this.price < that.price)
            return 1;
        else if(this.price == that.price)
            return 0;
        else
            return -1;
        
    }
}
//comparator interface 



public class Lec95_2 {
    public static void main(String[] args) {

        // Comparator<Car2> com = new Comparator<Car2>() {
            
        //     public int compare(Car2 i, Car2 j)
        //     {
        //         if(i.price > j.price)
        //             return 1;
        //         else    
        //             return -1;
        //     }
        // }; // Using traditional method

        Comparator<Car2> com = (i, j) -> i.price > j.price ? 1 : -1; // Using Arrow Function
        
            


        //     List<String> list = new ArrayList<>();
        //     list.add("1AdityaThakur");
        //     list.add("4Aksha");
        //     list.add("5Mani");
        //     list.add("6Ris"); 
        //     list.add("2AyushRaj");
        //     list.add("3AryanKr");
            


        //     System.out.println(list);
        //     Collections.sort(list, com);
            
        //     for(String n : list)
        //     {
        //         System.out.println(n);
        //     }


        List<Car2> cars= new ArrayList<>();
        cars.add(new Car2(230, "Mercedes E62"));
        cars.add(new Car2(210, "BMW M4"));
        cars.add(new Car2(220, "Volvo XC90"));
        cars.add(new Car2(230, "G-Wagon"));
        cars.add(new Car2(500, "Rolls Royce Phantom"));
        cars.add(new Car2(200, "Range Rover Defender"));

        
        for(Car2 s : cars)
        {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("-----------After Sorting using compare(parameters) method Of Comarator Interface---------");
        System.out.println();

        Collections.sort(cars, com); // using comaparator interface method sorting in which we have define our own logic for sorting the objects....
        for(Car2 s1 : cars)
        {
            System.out.println(s1);
        }

        System.out.println();
        System.out.println("-----------After Sorting using compareTo(parameters) method of Comparable Interface---------");
        System.out.println();

        Collections.sort(cars); //implementing comaparable interface and using this interface and using compareTo() method , we can do sorting in which we have define our own logic for sorting the objects and give the class the power to compare its own objects on its own....
        for(Car2 s2 : cars)
        {
            System.out.println(s2);
        }


    }
    
}
