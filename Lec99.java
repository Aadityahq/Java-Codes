import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lec99 {

    public static void main(String[] args) {
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n)
            {
                System.out.println(n);
            }  
        }; //forEach() gives a value at a time and takes object of Consumer Interface as parameter. --> accept() method is defined in the anonymous inner class.

        Predicate<Integer> condition = new Predicate<Integer>() {
                public boolean test(Integer n)
                {
                    if(n > 50)
                        return true;
                    else
                        return false;
                } 
        }; //filter() used to select the element that matches a condition and takes object of Predicate Interface as parameter. --> test() method is defined

        Function<Integer, Integer> func = new Function<Integer,Integer>()
                {
                    public Integer apply(Integer n)
                    {
                        n = n * 2;
                        return n;
                    }
                }; //map() used to take each value and transform it and  takes object of Functional Interface as parameter. --> apply() method is defined.

         BinaryOperator<Integer> add = new BinaryOperator<Integer>() {
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };


        //Above written interfaces can also be written as lambda expression.


        



        List<Integer> nums = Arrays.asList(22,41,575,52,41,100);
        nums.forEach(con);
        
        Stream<Integer> stream = nums.parallelStream();
        Stream<Integer> stream2 = stream.filter(condition);
        Stream<Integer> stream3 = stream2.map(func);
        Optional<Integer> result = stream3.reduce(add);
        System.out.println("----------");
        System.out.println(result);

        System.out.println("---Sorted Stream---");
        Stream<Integer> stream4 = nums.stream();
        Stream<Integer> stream5 = stream4.sorted();
        stream5.forEach(con);

    }
    
}
