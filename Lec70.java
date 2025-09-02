//Enum Class

enum WhiteHouseMembers 
{ Aditya(23), Aryan(23), Askhat(24), Ayush(22), Manish(21), Rishi(21);

    private int age;

    private WhiteHouseMembers(int age) 
    {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}


public class Lec70 
{
    
    public static void main(String[] args) 
    {
        
        WhiteHouseMembers memberName = WhiteHouseMembers.Aditya;
        System.out.println(memberName);
        
        System.out.println(WhiteHouseMembers.Askhat.ordinal());

        System.out.println(memberName.getClass().getSuperclass());

        System.out.println();

        WhiteHouseMembers allHouseMembers[] = WhiteHouseMembers.values();
          for( WhiteHouseMembers m : allHouseMembers)
        {
            System.out.println("Name - " + m + " : " + "age - " +  m.getAge());
        }
    }
}