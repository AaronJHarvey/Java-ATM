

import java.util.ArrayList;
import java.util.Scanner;



public class ATM {
  static User currentUser;
 
  public static void main(String[] args) {

    Session.login();
    currentUser = Session.currentUser;

  }
}
    


