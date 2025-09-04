// Wrapper Class


class A
{

    public void showClass() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showClass'");
    }

}

public class Lec60 
{
    public static void main(String[] args)
    {
       int age = 34;
       Integer num = new Integer(34); // Boxing -- Depreceted
       System.out.println(num);

       Integer num2 = 65; // autoBoxing
       System.out.println(num2);

       int num3 = Integer.valueOf(44); // unboxing
       System.out.println(num3);

       int num4 = num2;
       System.out.println(num4); // autoBoxing
    }
    
}
