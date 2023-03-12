
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ATM {
    private static User aaron = new User("Aaron", 1234);
    private static User alex = new User("Alex", 5678);
    private static ArrayList<User> users = new ArrayList<User>(
        Arrays.asList(aaron, alex)
    ) ;
    
    // public static void login() {
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Hello! Please enter your UserID: ");
    //    int inputId = in.nextInt();
    //     System.out.print(inputId);
    // }a
    public static void login() {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello! Please enter your UserID: ");
        String userInput = in.nextLine().toLowerCase();
        System.out.print("\n\n" + users.toString().contains(userInput)+ "\n\n");
        System.out.print("\n\n" + userInput.getClass() + "\n\n");
    //    System.out.print("\n\n" + users.contains(userInput) + "\n\n");
    }
   
    public static void main(String[] args) {

        login();
    }


  
        
}
    


