public class Menu2 {

    static String firstName;
    static String lastName;
    static int age;
    static String fatherName;
    static String phoneNumber;
    static String email;
    static String userName;
    static String password;
    // sstatic String address;

    public Menu2(String firstName, String lastName, int age, String fatherName,
                   String phoneNumber, String email, String userName,
                   String password) {

        Menu2.firstName = firstName;
        Menu2.lastName = lastName;
        Menu2.age = age;
        Menu2.fatherName = fatherName;
        Menu2.phoneNumber = phoneNumber;
        Menu2.email = email;
        Menu2.userName = userName;
        Menu2.password = password;
    }
    
    static void banner(){
        System.out.println("================================================");
        System.out.println("                 login successfull!            ");
        System.out.println("              Name: "+firstName+" "+lastName);
        System.out.println("              age: "+age);
        System.out.println("              fatherName:"+fatherName);
        System.out.println("              email: "+email);
        // System.out.println("              address: "+address);
        System.out.println();
        System.out.println("================================================");
        System.out.println(" ");

    
    }
}
