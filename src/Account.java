public class Account {
    private String accountType;
    private int accountBalance = 0;
    private String accString;

    public Account(String accountType, int accountBalance){
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    public String toString() {
        accString = accountType + " " + String.valueOf(accountBalance);
        return accString;
        
   }
}