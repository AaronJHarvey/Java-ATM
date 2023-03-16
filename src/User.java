import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private int userID;
    private int password;
    private ArrayList<Account> accounts;
  
    

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
    
    public String getAccounts() {
        return accounts.toString();
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