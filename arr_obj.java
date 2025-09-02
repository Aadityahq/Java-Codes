class Whitehouse
{
    String name;
    long phone_number;
    int roll;
    int aadhar;
    String department;
    

}

public class arr_obj 
{
    public static void main(String[] args) 
    {
        Whitehouse m1 = new Whitehouse();
        m1.name = "Aditya";
        m1.phone_number = 6205028024l;
        m1.aadhar = 3107;
        m1.roll = 51;
        m1.department = "CSE";

        Whitehouse m2 = new Whitehouse();
        m2.name = "Ayush";
        m2.phone_number = 7323091594l;
        m2.aadhar = 2355;
        m2.roll = 185;
        m1.department = "CSE";

        Whitehouse m3 = new Whitehouse();
        m3.name = "Akshat";
        m3.phone_number = 9798725338l;
        m3.aadhar = 2745;
        m3.roll = 45;
        m1.department = "IT";

        Whitehouse m4 = new Whitehouse();
        m4.name = "Aryan";
        m4.phone_number = 7543049047l;
        m4.aadhar = 6723;
        m4.roll = 89;
        m1.department = "CSE";

        Whitehouse m5 = new Whitehouse();
        m5.name = "Manish";
        m5.phone_number = 6207314759l;
        m5.aadhar = 8235;
        m5.roll = 51;

        Whitehouse m6 = new Whitehouse();
        m6.name = "Rishi";
        m6.phone_number = 9835116322l;
        m6.aadhar = 4217;
        m6.roll = 45;
        System.out.println();


        Whitehouse member[] = new Whitehouse[6];
        member[0] = m1;
        member[1] = m2;
        member[2] = m3;
        member[3] = m4;
        member[4] = m5;
        member[5] = m6;

        for(int i = 0; i < member.length; i++)
        {
            System.out.println("Name" + " : "  + member[i].name);
            System.out.println("Phone No." + " : " + member[i].phone_number);
            System.out.println("Roll" + " : "  + member[i].roll);
            System.out.println("Department" + " : " + member[i].department);
            System.out.println("Aadhar No." + " : " + member[i].aadhar);
            System.out.println();
        }

        System.out.println("Using enhanced for loop . . . . . . . . ");

        for(Whitehouse m : member)
        {
            System.out.println("Name" + " : "  + m.name);
            System.out.println("Phone No." + " : " + m.phone_number);
            System.out.println("Roll" + " : "  + m.roll);
            System.out.println("Department" + " : " + m.department);
            System.out.println("Aadhar No." + " : " + m.aadhar);
            System.out.println();
        }


        
    }
    
}
