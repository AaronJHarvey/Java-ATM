import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Session {

    private static ArrayList<User> users = new ArrayList<User>();
    static User a = new User(55465, 1234, new ArrayList<Account>(
        Arrays.asList(new Account("Checking",150),
        new Account("Savings", 100))
    ));
    static User al = new User(1234567, 5678, new ArrayList<Account>(
        Arrays.asList(new Account("Checking", 10000),
        new Account("Savings", 250))
    ));
    public static User currentUser;

    public static void login() {
        users.add(a);
        users.add(al);
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("Hello! Please enter your UserID: ");
            String inputID = in.nextLine();
            
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).toString().equals(inputID.toString())) {
                    User tempCurrentUser = users.get(i);
                    System.out.print("Please enter your PIN: ");
                    String inputPin = in.nextLine();
                    
                    if (inputPin.equals(tempCurrentUser.getPassword())) {
                        currentUser = tempCurrentUser;
                    } else {
                        System.out.print("Invalid PIN. Please Try Again. \n");
                    }
                    break;
                }
            }

            if (currentUser == null) {
                System.out.print("User Not Found. Please Try Again! \n");
            }
        } while (currentUser == null);
    }
}
