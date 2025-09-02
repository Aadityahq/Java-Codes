public class newswitch {

    public static void main(String[] args) {
        String name = "Aditya";
        // String result = ""; 

        // switch(name)
        // {
        //     case "Aditya", "Aryan" -> result = "8.1";
            
        //     case "Manish", "Ayush" -> result = "7.0";

        //     default -> result = "6.8";
        // }
        // System.out.println(result);





        // result = switch(name)
        // {
        //         case "Aditya", "Aryan" -> "8.1";
            
        //         case "Manish", "Ayush" ->  "7.0";

        //         default ->  "6.8";
        // };

        // System.out.println(result);






         String result = switch(name)
        {
                case "Aditya", "Aryan": yield "8.1";
            
                case "Manish", "Ayush": yield "7.0";

                default: yield "6.8";
        };

        System.out.println(result);
    }
    
}
