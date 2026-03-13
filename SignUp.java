import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Random;

public class SignUp {

    private  String firstName;
    private  int    age;
    private  String lastname;
    private  long   phoneNumber;
    private  String email;
    private  String address;
    private  String fatherName;
    private  String userName;
    private  String password;


    Random random = new Random();
// set up a new student 
    void newSignup() {
        firstName = getFirstName();
        lastname = getLatname();
        age = getAge();
        fatherName = getFathername();
        phoneNumber = getPhoneNumber();
        email = getEmail();
        address = getAddress();
        userName = userName();
        password = savePassword();

        System.out.println("sign-up successful!");
        
        saveToCSV();
    }

// get name
    private String getFirstName(){
        System.out.print("First name: ");
        return Input.scanner.next().trim();
    }

// get last name
    private String getLatname(){
        System.out.print("Last name: ");
        return Input.scanner.next();
    }
// get age
    private int getAge(){
        System.out.print("Age: ");
        return Input.scanner.nextInt();
    }
// get father name
    private String getFathername(){
        System.out.print("Father's name: ");
        Input.scanner.nextLine();
        return Input.scanner.nextLine();
    }
// get phone number
    private long getPhoneNumber(){
        System.out.print("Phone number: ");
        return Input.scanner.nextLong();
    }
// get email
    private String getEmail(){
        System.out.print("Email: ");
        return Input.scanner.next();

    }
// get address
    private String getAddress(){
        System.out.print("Address: ");
        return  Input.scanner.nextLine();
    }

// get the username
    private String userName(){
        System.out.print("create a user-name: (min 8 characters and atleat a special symbol(only:! @ # $ % ^ & * { } - _): ");
        String temp = Input.scanner.next();
        if ((temp.contains("!")||temp.contains("@")||temp.contains("#")||temp.contains("$")||
            temp.contains("%")||temp.contains("^")||temp.contains("&")||temp.contains("*")||
            temp.contains("{")||temp.contains("}")||temp.contains("-")||temp.contains("_"))&&
            temp.length()>=8) {
            return temp;
        }
        else{
            System.out.println();
            System.out.println("User name should have min 8 characters and atleat a special symbol(only:! @ # $ % ^ & * { } - _\"");
            userName();
        }
        return null;
    } 

// get the user password
    private String savePassword(){
        System.out.print("create password: ");
        String temp  = Input.scanner.next();
        System.out.print("re-enter the password: ");
        String temp2 = Input.scanner.next();

        if (!(temp.trim().equals(temp2))){
            System.out.println("passwod did not match!");
            savePassword();
        }else if(!(temp.contains("!")||temp.contains("@")||temp.contains("#")||temp.contains("$")||
            temp.contains("%")||temp.contains("^")||temp.contains("&")||temp.contains("*")||
            temp.contains("{")||temp.contains("}")||temp.contains("-")||temp.contains("_"))&&
            temp.length()<8) {
            System.out.println("User name should have min 8 characters and atleat a special symbol(only:! @ # $ % ^ & * { } - _\"");
            savePassword();
        }else{
            System.out.println();
            System.out.println("paword saved successfully!");
            return temp.trim();
        }
        return null;
    }

// make a CSV file to save details
    void saveToCSV() {

        try {

            File file = new File("students.csv");
            boolean fileExists = file.exists();

            FileWriter writer = new FileWriter(file, true);

            // Write header only if file is new
            if (!fileExists) {
                writer.write("FirstName,LastName,Age,FatherName,Phone number,Email,User Name,password\n");
            }

            // Write student data
            writer.write(
                    firstName + "," +
                    lastname + "," +
                    age + "," +
                    fatherName + "," +
                    phoneNumber + "," +
                    email + "," +
                    userName + ","+
                    password + ","+
                    address + "\n"
            );

            writer.close();

        } catch (IOException e) {
            System.out.println("Error in writing to file.");
        }
    }
}