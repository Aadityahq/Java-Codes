// Inheritance 

class Calc1 {
   Calc1() {
   }

   public int add(int var1, int var2) {
      return var1 + var2;
   }

   public int sub(int var1, int var2) {
      return var1 - var2;
   }
}

//AdvCalc - child class //Calc - Parent Class
class AdvCalc extends Calc1 
{
    public int mul(int num1, int num2)
    {
        return num1 * num2;
    }

    public int div(int num1, int num2)
    {
        return num1 / num2;
    }
}

class VeryAdvCal extends AdvCalc
{
    public double power(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
}

public class Lec47 
{

    public static void main(String[] args)
    {
        Calc c = new Calc();
        AdvCalc obj = new AdvCalc();
        System.out.println(c.add(4, 9));

        System.out.println(obj.mul(2,5));
        System.out.println(obj.sub(2,5));

        //use of multiple inheritence
        VeryAdvCal obj1 = new VeryAdvCal();

        int r1 = obj1.add(3, 8);
        int r2 = obj1.sub(3, 8);
        int r3 = obj1.mul(3, 8);
        int r4 = obj1.div(3, 8);
        double r5 = obj1.power(3, 8);

        System.out.println("add : " + r1);
        System.out.println("sub : " + r2);
        System.out.println("mul : " + r3);
        System.out.println("div : " + r4);
        System.out.println("power : " + r5);
        



    }
}
