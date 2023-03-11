
import java.util.Scanner;


public class ATM {

   
    public static void main(String[] args) {
        login();
    }


     public static void login(){
        Scanner in = new Scanner(System.in);
        System.out.print("Hello! Please enter your UserID: ");
        int inputId = in.nextInt();
        System.out.print(inputId);
    }
        
}
    


