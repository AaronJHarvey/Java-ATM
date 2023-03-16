

import java.util.ArrayList;
import java.util.Scanner;



public class ATM {
  static User currentUser;
 
  public static void main(String[] args) {

    Session.login();
    currentUser = Session.currentUser;
    System.out.print("The current password is: " + currentUser.getPassword() + "\n\n");
    currentUser.changePassword(99999);
    System.out.print("The new password is: " + currentUser.getPassword());
  }
}
    


