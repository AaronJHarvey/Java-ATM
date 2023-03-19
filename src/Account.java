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
        System.out.print("Enter amount to deposit: ");
        Scanner in = new Scanner(System.in);
        int depAmount = in.nextInt();
        System.out.print(
                "\n     Previous Balance: $" + accountBalance + "\n     Amount Deposited: $" + depAmount + "\n     New Balance: $");
        System.out.println(accountBalance += depAmount);

    }

    public void chooseTransaction() {
        int x = 0;
        
            System.out.print("\n\n Please choose what you wish to do: \n" +
            " Press 1 for Deposit \n" + 
            " Press 2 for Withdraw \n" + 
            " Press 3 for Current Balance \n"+
            " Press 4 to Exit \n"
            );
            do {
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
                    x = 1;
                    break;
                default:
                    System.out.print("Invalid entry. Please Try Again");
            }
        } while( x != 1);
    }
}
