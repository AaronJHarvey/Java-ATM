import java.util.ArrayList;

public class User {
    private int userID;
    private int password;
    // private ArrayList<Account> accounts;

    public User(int userID, int password) {
        this.userID = userID;
        this.password = password;
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
