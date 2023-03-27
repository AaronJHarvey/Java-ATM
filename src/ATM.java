

import java.util.ArrayList;
import java.util.Scanner;



public class ATM {
  static User currentUser;
  static Account accountChoice;

 
  public static void main(String[] args) {



    Session.login();
    currentUser = Session.currentUser;
    accountChoice = currentUser.chooseAccount();
    accountChoice.chooseTransaction();

  }
}
    


