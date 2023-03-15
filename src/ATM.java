

import java.util.ArrayList;
import java.util.Scanner;



public class ATM {
  private static ArrayList<User> users = new ArrayList<User>();
  static User a = new User("Aaron", 1234);
  static User al = new User("Alex", 5678);
  static User currentUser;

  public static void login() {
    users.add(a);
    users.add(al);


    Scanner in = new Scanner(System.in);
    do {
      System.out.println("Hello! Please enter your name: ");
      String inputName = in.nextLine();

      for (int i = 0; i < users.size(); i++) {
        if (users.get(i).toString().toLowerCase().equals(inputName.toLowerCase())) {
          currentUser = users.get(i);
          break;
        }
      }
      if (currentUser == null) {
        System.out.print("User Not Found. Please Try Again! \n");
      }
    } while (currentUser == null);
  }
  
  
  
  public static void main(String[] args) {
    login();
    System.out.print(currentUser);
  }    
}
    


