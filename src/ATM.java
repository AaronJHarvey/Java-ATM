

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
  
  
  
  
  public static void main(String[] args) {
    login();
  }    
}
    


