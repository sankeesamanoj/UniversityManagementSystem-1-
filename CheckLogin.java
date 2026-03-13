import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckLogin {

    boolean checkLogin(String username, String password) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("students.csv"));

            String line;

            // skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.replace("\"", "").split(",");

                String storedUsername = data[6];
                String storedPassword = data[7];

                if (storedUsername.equals(username) && storedPassword.equals(password)) {

                    reader.close();

                    Menu2 main2 = new Menu2(data[0],                 
                                            data[1],                 
                                            Integer.parseInt(data[2]),
                                            data[3],                 
                                            data[4],                
                                            data[5],                 
                                            data[6],                 
                                            data[7] );                                    

                    return true;
                }
                else{
                    reader.close();
                    return false;
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    return false;
    }
}