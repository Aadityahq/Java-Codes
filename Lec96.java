//Need Of Stream API

import java.util.List;
import java.util.Arrays;
//import java.util.stream.Stream;

public class Lec96 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25, 29, 58, 24, 98);

        //Stream<Integer> stream = list.stream();
       
        list.forEach(n -> System.out.println(n));
        
        

    }
    
}
