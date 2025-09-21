//Stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lec98 {
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(23,56,68,12,294);

        Stream<Integer> stream = nums.stream();

        //stream.forEach(n -> System.out.println(n));

        Stream<Integer> stream2 = stream.sorted();
        stream2.forEach(n -> System.out.println(n));
        System.out.println("-----------------------");

        Stream<Integer> stream3 = nums.parallelStream(); // creates a parallel stream that can process elements concurrently using multiple threads, on a collection itself.
        int total = stream3.filter(n -> n < 50)
                          .map(n -> n * 2)
                          .reduce(0, (c,e) -> c + e);
        System.out.println(total);
    }
    
}
