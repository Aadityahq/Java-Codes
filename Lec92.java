//ArrayList in Java

import java.util.ArrayList;
import java.util.List;

public class Lec92 {

    public static void main(String[] args) {
        
        List<String> str = new ArrayList<String>();

        str.add("Aditya");
        str.add("Ayush");
        str.add("Aryan");
        str.add("Akshat");
        str.add("Manish");
        str.add("Rishi");
        str.add("Aditya");
        
        System.out.println(str);

        for(Object n : str)
        {
            System.out.println(str.indexOf(n) + " " + n);
        }

        System.out.println();
        System.out.println(str.get(5));

        System.out.println(str.size());

        str.addFirst("Ankur");

        System.out.println(str);

    }
    
}
