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

    public void deposit() {
        do {

        }
        // accountBalance += amount;
        // System.out.print(accountBalance);
    }

    public void chooseTransaction() {
        System.out.print("\n\n Please choose what you wish to do: \n" +
         " Press 1 for Deposit \n" + 
         " Press 2 for Withdraw \n" + 
         " Press 3 for Current Balance \n"+
         " Press 4 to Exit \n"
        );
        Scanner in = new Scanner(System.in);
        int transaction = in.nextInt();
        switch (transaction) {
            case 1:
                deposit();
                break;
            case 2:
                System.out.print("Withdraw");
                // withdraw();
                break;
            case 3:
                System.out.print("Balance");
                // getBalance();
                break;
            case 4:
                break;
            default:
                System.out.print("Invalid entry. Please Try Again");
        }

        if (transaction == 1) {
            deposit();
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
