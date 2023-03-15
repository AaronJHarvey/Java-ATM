import java.util.ArrayList;
import java.util.Scanner;

public class Session {

    private static ArrayList<User> users = new ArrayList<User>();
    static User a = new User(55465, 1234);
    static User al = new User(1234567, 5678);
    public static User currentUser;

    public static void login() {
        users.add(a);
        users.add(al);
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Hello! Please enter your name: ");
            String inputID = in.nextLine();
            
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).toString().equals(inputID.toString())) {
                    currentUser = users.get(i);
                    break;
                }
            }
            if (currentUser == null) {
                System.out.print("User Not Found. Please Try Again! \n");
            }
        } while (currentUser == null);
    }
}
