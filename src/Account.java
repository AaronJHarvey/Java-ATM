import java.util.Scanner;



public class Account {
    String accountType;
    private int accountBalance;
    private String accString;
    int x = 0;
    String answer = "";
    int resp = 11;



    public Account(String accountType, int accountBalance){
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    public String toString() {
        accString = accountType + " " + String.valueOf(accountBalance);
        return accString;

    }

    public void deposit() {
        int resp = 10;
        System.out.print("Enter amount to deposit: ");
        Scanner in = new Scanner(System.in);
        int depAmount = in.nextInt();
        System.out.print(
                "\n     Previous Balance: $" + accountBalance + "\n     Amount Deposited: $" + depAmount
                        + "\n     New Balance: $");
        System.out.println(accountBalance += depAmount);
        
        do {
            doAnotherTransaction();
        } while (resp != 10);
    }
    
    public void doAnotherTransaction() {
        Scanner in = new Scanner(System.in);
            System.out.print("\n\n Would you like to complete another transaction? \n" +
                "     Press 1 for Yes\n" +
                "     Press 2 for No\n");
            int cont = in.nextInt();

            switch (cont) {
                case 1:
                    resp = 10;
                    chooseTransaction();
                    break;
                case 2:
                    resp = 10 ;
                    x = 1;
                    break;
                default:
                    System.out.println("Invalid response Please Try Again.");
                    resp = 11;
            }
    }
    
    public void withdraw() {

        System.out.print("Enter amount to withdraw:  ");
        Scanner in = new Scanner(System.in);
        int withdrawAmount = in.nextInt();
        
        if (accountBalance - withdrawAmount < 0) {
            System.out.print("This withdraw will result in a negative balance for this account. Continue anyway? ");
            in.nextLine();
            answer = in.nextLine();
            if (answer.toLowerCase().equals("yes")) {
                System.out.println("Previous Account Balance: $" + accountBalance + 
                        "\n Amount Withdrawn: $" + withdrawAmount +
                        "\n New Balance: $" + (accountBalance -= withdrawAmount));
            } else {
                withdraw();
            }
        } else {
            System.out.print("\n      Previous Balance: $" + accountBalance +
                    "\n      Amount Withdrawn: $" + withdrawAmount +
                    "\n      New Account Balance: $" + (accountBalance -= withdrawAmount) + "\n");
        }
        do {
            doAnotherTransaction();
        } while (resp != 10);
    }
    
    public int getBalance() {
        System.out.print("\n\n Your account Balance for " + accountType + " is $");
        System.out.print(accountBalance + "\n");
        do {
            doAnotherTransaction();
        } while (x != 10);
         return accountBalance;
    }

    public void transfer() {
        User curr = ATM.currentUser;
        // Make sure that the user has more than one account 
        if (curr.accounts.size() > 1) {

            System.out.print("You will be making a transfer from your " + accountType
                    + " account. What account would you like to transfer money to? ");   
            }
            // if yes, ask them to verify they want to transfer from (current account) and ask them which account they wish to transfer the money to.
            // if no, return message saying transfer cannot be done. 
        // Once they have confirmed they want to do the transfer and chosen the account: 
            // Ask for the amount to transfer.
            // withdraw that amount from the current account - following same rules as withdraw method
            // deposit that amount into the chosen account


    }


    public void chooseTransaction() {
        
        do {
            System.out.print("\n\n Please choose what you wish to do: \n" +
            " Press 1 for Deposit \n" + 
            " Press 2 for Withdraw \n" + 
            " Press 3 for Current Balance \n"+
            " Press 4 for Transfer \n" +
            " Press 5 to Exit \n"
            );
            
            Scanner in = new Scanner(System.in);
            int transaction = in.nextInt();
            switch (transaction) {
                case 1:
                    deposit();
                    break;
                case 2:
                    // System.out.print("Withdraw");
                    withdraw();
                    break;
                case 3:
                    // System.out.print("Balance");
                    getBalance();
                    break;
                case 4:
                    // System.out.println("Transfer");
                    transfer();
                    break;
                case 5:
                    x = 1;
                    break;
                default:
                    System.out.print("Invalid entry. Please Try Again");
            }
        } while( x != 1);
    }
}
