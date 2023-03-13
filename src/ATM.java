

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;


public class ATM {
  private static ArrayList<User> users = new ArrayList<User>();
  static User a = new User("Aaron", 1234);
  static User al = new User("Alex", 5678);
  static User currentUser;

  public static void login() {
    users.add(a);
    users.add(al);

    Scanner in = new Scanner(System.in);
    System.out.print("Hello! Please enter your name: ");
    String inputName = in.nextLine();


    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).toString().toLowerCase().equals(inputName.toLowerCase())) {
        currentUser = users.get(i);
        break;
      }
    }
  }
  
    
    // public static void login() {
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Hello! Please enter your UserID: ");
    //    int inputId = in.nextInt();
    //     System.out.print(inputId);
    // }a users.add(a);
      // users.add(al);
      
      //   Scanner in = new Scanner(System.in);
      //   System.out.println("Welcome! Please put in your Name: ");
      //   String userInput = in.nextLine().toLowerCase();


      //   for (int i = 0; i < users.size(); i++) {
      //     //  System.out.print( users.get(i).getName().toLowerCase().getClass() == userInput.toString().getClass() );
      //     if (users.get(i).getName().toLowerCase().equals(userInput)) {
      //        currentUser = users.get(i);
      //       break;
      //     };

   
    public static void main(String[] args) {
      login();
    }    
}
    


