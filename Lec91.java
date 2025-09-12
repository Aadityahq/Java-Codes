// Collection API 


import java.util.ArrayList;
import java.util.Collection;


public class Lec91 {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(8);
        nums.add(9);
        nums.add(2);
        nums.add(6);
        nums.add(7);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);

           
        for(int n : nums)
        {
            System.out.println(n);
        }
        
        
    }
    
}
