
import tools.*;


public class Lec53
{
    public static void main(String[] args) 
    {
        CalcPro obj = new CalcPro();
        AdvCalcPro obj1 = new AdvCalcPro();

        int r1 = obj.add(2,5);
        int r2 = obj1.mul(2,4,5);

        System.out.println(r1);
        System.out.println(r2);
    }
}