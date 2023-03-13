import java.util.ArrayList;

public class User {
    private String name;
    private int password;
    // private ArrayList<Account> accounts;

    public User(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public void changeName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return String.valueOf(password);
    }

    public String toString() {
        return String.valueOf(name);
    }

    
}
