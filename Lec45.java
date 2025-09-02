// Naming Convention-- Java follows Camel Casing

class Human //Pascal Case
{
    private int age ; //Camel Case
    private String gender;

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(String gender)
    {
         this.gender = gender;
    }

    public int getAge() // Camel Case
    {
        return age;
    }

    // Q.) How do i get multiple values using getter ? like i want to get value of age nad gender both using the same method
    public String getGender()
    {
        return gender;
    }

}

public class Lec45 {
    public static void main(String[] args)
     {
        System.out.println("Main class");
        Human obj1 = new Human();
        Human obj2 = new Human();

        obj1.setAge(23);
        obj1.setGender("Male");

        System.out.println(obj1.getGender() + " : " + obj1.getAge());

        obj2.setAge(21);
        obj2.setGender("Female");

        System.out.println(obj2.getGender() + " : " + obj2.getAge());



    }
    
}