//need of intefaces




// interface Computer
// {
//     void code();
// }

// class Laptop implements Computer
// {
//     public void code()
//     {
//         System.out.println("code, compile, run");
//     }
// }

// class Desktop implements Computer 
// {
//     public void code()
//     {
//         System.out.println("code, Compile, run : Faster");
//     }
// }


// class Developer
// {
//     public void devApp(Computer lap)
//     {
//         lap.code();
//     }
// }

// public class Lec66
// {
//     public static void main(String[] args) {
        
//         Computer laptop = new Laptop();
//         Computer desktop = new Desktop();

//         Developer adi = new Developer();
//         adi.devApp(laptop);

//         Developer navin = new Developer();
//         navin.devApp(desktop);
//     }
// }

























interface Student
{   
    void study();
    void learn();
    void code();
}


// class Student 
// {
//     public void learn()
//     {
//         System.out.println( "is learning");
//     }
// }


class ComputerStudent implements Student
{

    public void study()
    {
        System.out.println("Student is studying");
    }

    public void learn()
    {
        System.out.println("Student is learning");
    }

    public void code()
    {
        System.out.println("Computer student code");
    }

}

class CivilStudent implements Student
{
     public void study()
    {
        System.out.println("Student is studying");
    }

    public void learn()
    {
        System.out.println("Student is learning");
    }

    public void code()
    {
        System.out.println("Civil student don't code");
    }
}

class StudChar
{
    public void study(Student stud)
    {
        stud.code();
    }
}

public class Lec66
{
 

    public static void main(String[] args) 
    {
        Student stud = new ComputerStudent();
        Student stud1 = new CivilStudent();

        
       StudChar student = new StudChar();


        student.study(stud);
        student.study(stud1);

       
    }
    
}
