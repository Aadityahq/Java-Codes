// Set Interface

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lec93 {
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(8);
        nums.add(0);
        nums.add(3);
        nums.add(78);
        nums.add(86);
        nums.add(8);

        System.out.println(nums);

        Set<Integer> nums2 = new TreeSet<Integer>(); //nums & num2 are iterable
        nums2.add(0);
        nums2.add(3);
        nums2.add(78);
        nums2.add(86);
        nums2.add(8);
        nums2.add(8);
        
        System.out.println(nums2);
        Iterator<Integer> values = nums.iterator(); /// Values is an iterator
        while(values.hasNext())
            System.out.println(values.next());

        System.out.println(nums2);
        Iterator<Integer> values2 = nums2.iterator(); //Values2 is an iterator
        while(values2.hasNext())
            System.out.println(values2.next());

    }
    
}
