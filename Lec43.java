// Constructor


class Human
{
    private int age;
    private String name;
    private String gender;

    //Default Constructor
    public Human()
    {
        //System.out.println("Constructor Scope initialised");
        age = 20; // value of the age variable set to 20
        name = "John";
        gender = "Male";
    }

    //Parameterized Constructor
    public Human(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name)
    {
        this.name = name;
        this.age = 20;
    }


     public void setAge(int age)
    {
        this.age = age;
    }

     public void setName(String name)
    {
        this.name = name;
    }

    public void setGender(String gender)
    {
         this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

     public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

}


public class Lec43 
{
    public static void main(String[] args)
    {
        Human obj1 = new Human();
        Human obj2 = new Human("Richa",24,"Female");
        Human obj3 = new Human("Manish");


        System.out.println(obj1.getName() + " : " + obj1.getAge() + " : " + obj1.getGender());
        System.out.println(obj2.getName() + " : " + obj2.getAge() + " : " + obj2.getGender());
        System.out.println(obj3.getName() + " : " + obj3.getAge() + " : " + obj3.getGender());


        


        
    }
}
