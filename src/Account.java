import java.util.Scanner;

public class Account {
    String accountType;
    private int accountBalance;
    private String accString;

    public Account(String accountType, int accountBalance){
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    public String toString() {
        accString = accountType + " " + String.valueOf(accountBalance);
        return accString;

    }

    public void deposit(int amount) {
        accountBalance += amount;
        System.out.print(accountBalance);
    }

    public void chooseTransaction() {
        System.out.print("\n\n Please choose what you wish to do: \n");
        Scanner in = new Scanner(System.in);
        int transaction = in.nextInt();
        if (transaction == 1) {
            deposit(2);
        }
    }

    
   
    // public void deposit(int amount) {
        // do {
        //     System.out.print()
        // }
        // accountBalance += amount;
        // System.out.print("Your new balance is: " + String.valueOf(accountBalance));
    // }
}
