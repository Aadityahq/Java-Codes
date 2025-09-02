// Enum with if -else and switch

enum WhiteHouseMembers 
{ Aditya, Aryan, Askhat, Ayush, Manish, Rishi}


public class Lec69 
{
    
    public static void main(String[] args) {
        
        WhiteHouseMembers memberName = WhiteHouseMembers.Aditya;
        System.out.println(memberName);

        System.out.println();
        WhiteHouseMembers allHouseMembers[] = memberName.values();

        for( WhiteHouseMembers m : allHouseMembers)
        {
            System.out.println(m);
        }

        System.out.println();
        memberName = memberName.Rishi;

         if(memberName == memberName.Aditya)
            System.out.println("His age is 23");
         else if(memberName == memberName.Aryan)
            System.out.println("His age is also 23");
         else if(memberName == memberName.Askhat)
            System.out.println("His age is 24");
         else if(memberName == memberName.Manish)
            System.out.println("His age is  22");
         else if(memberName == memberName.Rishi)
            System.out.println("His age is 21");
         else if(memberName == memberName.Ayush)
            System.out.println("His age is 22");

        

        System.out.println();
        memberName = memberName.Manish;

        switch (memberName) {
            case Aditya:
                System.out.println("Black Devil");
                break;
            case Aryan:
                System.out.println("Mota Bhai");
                break;
            case Askhat:
                System.out.println("Saitan");
                break;
            case Ayush:
                System.out.println("Guddu Chamkila");
                break;
            case Manish:
                System.out.println("Chhela Bihari");
                break;
            default:
                System.out.println("Friendzoned Guy");
                break;
        }
    
 }
}
