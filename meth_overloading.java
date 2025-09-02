class Calculator
{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

     public int add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }

}

public class meth_overloading
{
    public static void main(String args[])
    {
        int n1 = 4;
        int n2 = 7;
        int n3 = 9;

        Calculator calc = new Calculator();

        int result = calc.add(n1,n2);
        System.out.println(result);

        int result2 = calc.add(n1,n2,n3);
        System.out.println(result2);

        Calculator calc2 = new Calculator();

        double result3 = calc2.add(n1,n2);
        System.out.println(result3);

    }
}


