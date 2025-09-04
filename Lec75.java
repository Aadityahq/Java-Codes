//Lambda Expression with return 

interface MeraDost
{
    int noOfDost(int num);
}

public class Lec75 
{
    public static void main(String[] args)
    {
        MeraDost dost = (int num) -> num;

        int  total_dost = dost.noOfDost(5);
        System.out.println("My Total dost - " + total_dost);
     
    }
    
}
