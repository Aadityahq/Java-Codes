//forEach Method

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class Lec97 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(25, 29, 58, 24, 98);

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n)
        //     {
        //        System.out.println(n + " - Double : " + n * 2);
               
        //     }
        // };
        // As Consumer is a functional interface, we can write as lambda expression
        //Consumer<Integer> con = (n) -> System.out.println(n + " - Double : " + n * 2);

        //list.forEach(con);

        // so we can write this instead.
        list.forEach(n -> System.out.println(n + " - Double : " + n * 2));
        
    }
    
}
