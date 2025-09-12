//Map Interface

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lec94 {
    public static void main(String[] args) {

        Map<Integer, String> members = new HashMap<Integer, String>();

        members.put(1,"Aditya");
        members.put(2,"Aryan");
        members.put(3,"Ayush");
        members.put(5,"Akshat");
        members.put(4,"Rishi");
        members.put(6,"Manish");

        
        System.out.println(members);

        System.out.println(members.get(5));
        
        System.out.println(members.entrySet());

        System.out.println(members.values());

        System.out.println(members.keySet());

        members.remove(5);

        System.out.println(members.entrySet());

        Map<String, String> name = new Hashtable<>();

        name.put("Haddi", "Manish");
        name.put("Mota Bhai", "Aryan");
        name.put("Budhe Aadmi", "Akshat");
        name.put("Kalua2", "Ayush");
        name.put("Kalua", "Aditya");
        
        System.out.println();
        System.out.println(name.entrySet());

    }
    
}
