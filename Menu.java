public abstract class Menu {

    public static void printMenu(){
        System.out.println("====================================");
        System.out.println("                MENU");
        System.out.println("   Options:");
        System.out.println("1. Sign-up (only as a Studetnt)");
        System.out.println("2. Login");
        System.out.println("3. register as new Employee");
        System.out.println("0. Exit");
        System.out.print("Enter your option: ");
        int userOption= Input.scanner.nextInt();
        SignUp signUp = new SignUp();
        if (userOption == 1) {
            signUp.newSignup();
        }else if (userOption ==2) {
            System.out.print("Enter your user id: ");
            String userName = Input.scanner.next();
            System.out.print("Enter your password: ");
            String password = Input.scanner.next();
            CheckLogin checkLogin = new CheckLogin();
            if (checkLogin.checkLogin(userName, password)) {
                Menu2.banner();
            }
            else
                System.out.println("Invalid user name or password");
        }else if (userOption == 3) {
            System.out.println();
            System.out.println("contact : ");
            System.out.println("phone number: 1234xxxxx0");
            System.out.println("email: abcd@gmail.com");
            System.out.println();
            Input.scanner.close();
            return;
        }else if (userOption == 0) {
            Input.scanner.close();
            return;
        }else
            System.out.println("Enter a valid input! ");
        
    }

    
}