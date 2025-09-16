//comparator interface 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lec95_1 {
    public static void main(String[] args) {

        Comparator<String> com = (String i, String j) ->
            {
                if(i.length() > j.length())
                    return 1;
                else    
                    return -1;
            };
            


            List<String> list = new ArrayList<>();
            list.add("1AdityaThakur");
            list.add("4Aksha");
            list.add("5Mani");
            list.add("6Ris"); 
            list.add("2AyushRaj");
            list.add("3AryanKr");
            


            System.out.println(list);
            Collections.sort(list, com);
            
            for(String n : list)
            {
                System.out.println(n);
            }
                

            
        }
    
}
