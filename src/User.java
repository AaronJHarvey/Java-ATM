import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class User {
    private int userID;
    private int password;
    ArrayList<Account> accounts;
    public Account accountChoice;
  
    

    public User(int userID, int password, ArrayList<Account> accounts ) {
        this.userID = userID;
        this.password = password;
        this.accounts = accounts;
        System.out.println(this.accounts);
    }

    public void createAccount(String name, int balance) {
        Account x = new Account(name, balance);
        accounts.add(x);
        System.out.print(name +" Account Created \n");
        System.out.println(accounts.toString());
    }
    
    public Account chooseAccount() {
        System.out.print("Please choose your desired account: ");
        int x = 1;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < accounts.size(); i++) {
            System.out.print("\n\n" + "Press " + x + " for " + accounts.get(i).accountType + "\n\n");
            x++;
        }
        int choice = in.nextInt();
        accountChoice = accounts.get(choice - 1);
        System.out.print(accountChoice);
        return accountChoice;
   }

    
    public int getID() {
        return userID;
    }

    public String getPassword() {
        return String.valueOf(password);
    }

    public void changePassword(int password) {
        this.password = password;
    }

    public String toString() {
        return String.valueOf(userID);
    }

    
}

// On the user call a method to get the accounts they have. 
// Prompt them to choose an account 
// 