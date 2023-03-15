import java.util.ArrayList;

public class User {
    private int userID;
    private int password;
    // private ArrayList<Account> accounts;

    public User(int userID, int password) {
        this.userID = userID;
        this.password = password;
    }

    public void changeName(int userID) {
        this.userID= userID;
    }
    
    public int getID() {
        return userID;
    }

    public String getPassword() {
        return String.valueOf(password);
    }

    public String toString() {
        return String.valueOf(userID);
    }

    
}
