class Human
{
    private int age ;
    private String gender;

    public void setAge(int num)
    {
        age = num;
    }

    public void setGender(String g)
    {
         gender = g;
    }

    public int getAge()
    {
        return age;
    }

    // Q.) How do i get multiple values using getter ? like i want to get value of age nad gender both using the same method
    public String getGender()
    {
        return gender;
    }

}

public class Lec40 {
    public static void main(String[] args)
     {
        System.out.println("Main class");
        Human h = new Human();

        System.out.println(h.getAge());
        System.out.println(h.getGender());
        
        h.setAge(23);
        h.setGender("Male");

        System.out.println(h.getAge());
        System.out.println(h.getGender());

    }
    
}