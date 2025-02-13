import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        String tempChar;

        //Get User's Name
        System.out.println("Enter your Name: ");
        String AccountName = scanner.nextLine();
        //Get User's Account Balance
        System.out.println("Enter the balance in your account: ");
        double Balance = scanner.nextDouble();
        scanner.nextLine();

        //Make an object instance
        BankAccount Account = new BankAccount(AccountName, Balance);

        //Print the object made
        System.out.println("Account Name: " + Account.getName());
        System.out.println("Account Balance: $" + Account.getBalance());

        //Ask for transaction type
        System.out.println("What would you like to do today?");
        System.out.println("W/w for Withdraw | D/d for Deposit");
        tempChar = scanner.nextLine();
        //Check for input and do the action accordingly
        if(tempChar.equals("D") ||tempChar.equals("d")) {
            System.out.println("How much would you like to Deposit");
            temp = scanner.nextDouble();
            Account.Deposit(temp);
        }
        else if (tempChar.equals("W") ||tempChar.equals("w")) {
            System.out.println("How much would you like to withdraw");
            temp = scanner.nextDouble();
            Account.Withdraw(temp);
        }
        else{
            System.out.println("Invalid Input, please put W/w for Withdraw | D/d for Deposit!");
        }

        //Create a report after it is done
        System.out.println("Thank you! Here is your report:");
        System.out.println("Name: "+ AccountName);
        System.out.println("Balance: $"+ Account.getBalance());
    }
}
