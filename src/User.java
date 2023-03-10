

public class User {
    private String name;
    private int password;
    private String accounts;

    public User(String name) {
        this.name = name;
    }

    public void changeName(String name){
        this.name = name;
    }


    public String toString() {
        return String.valueOf(name);
    }
}
