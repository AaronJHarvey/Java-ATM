

import java.util.ArrayList;
import java.util.Scanner;



public class ATM {
  static User currentUser;
  static Account accountChoice;

 
  public static void main(String[] args) {

    // User test = new User(98765, 123);

    Session.login();
    currentUser = Session.currentUser;
    // currentUser.chooseAccount();
    accountChoice = currentUser.chooseAccount();


    // currentUser.accounts.get(1).deposit(1000);
   
    



    // currentUser.createAccount("Checking", 0);
    // currentUser.createAccount("Savings", 150);
    // System.out.print("\n\n" + currentUser.getAccounts() + "\n\n");

    // System.out.print("The current password is: " + currentUser.getPassword() + "\n\n");
    // currentUser.changePassword(99999);
    // System.out.print("The new password is: " + currentUser.getPassword());
  }
}
    


