package ATMInterface;
//import java.sql.SQLOutput;
//import java.util.*;
import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("Enter your PIN:");
        Scanner scanner = new Scanner(System.in);
        int enteredpin = scanner.nextInt();

        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Please enter a valid PIN");
        }
    }

    public void menu(){
        System.out.println("What do you want?");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner scanner =new Scanner(System.in);
        int option = scanner.nextInt();

        if(option == 1){
            checkBalance();
        }
        else if(option == 2){
            withdrawMoney();
        }
        else if(option == 3){
            depositMoney();
        }
        else if(option == 4){
            return;
        }
        else{
            System.out.println("Please enter a valid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Your Balance: " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextInt();

        if(amount>Balance){
            System.out.println("Insufficient Balance! Please Check Your Account Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Withdraw Successful!");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        Balance = Balance + amount;
        System.out.println("Deposit Successful!");
        menu();
    }
}



public class ATMInterface {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();

    }
}
