

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;


public class ATM {
    private static ArrayList<User> users = new ArrayList<User>();
    static User aaron = new User("Aaron", 1234);
    static User alex = new User("Alex", 5678);


    
    // public static void login() {
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Hello! Please enter your UserID: ");
    //    int inputId = in.nextInt();
    //     System.out.print(inputId);
    // }a

   
    public static void main(String[] args) {
        users.add(aaron);
        users.add(alex);
        for (int i = 0; i < users.size(); i++) {
          System.out.print("Test\n" + users.get(i).getPassword() + "\n");
            
        }

        // Scanner in = new Scanner(System.in);
        // String userInput = in.nextLine().toLowerCase();




        // System.out.println(users.toString().toLowerCase().contains(userInput));

    }


  
        
}
    


