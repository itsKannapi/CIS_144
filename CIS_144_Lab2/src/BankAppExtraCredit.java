import javax.swing.JOptionPane;

public class BankAppExtraCredit {
    public static void main(String[] args) {
        double temp;
        String tempChar;

        // Get User's Name
        String AccountName = JOptionPane.showInputDialog("Enter your Name:");
        // Get User's Account Balance
        String balanceInput = JOptionPane.showInputDialog("Enter the balance in your account:");
        double Balance = Double.parseDouble(balanceInput);

        // Make an object instance
        BankAccount Account = new BankAccount(AccountName, Balance);

        // Print the object made
        JOptionPane.showMessageDialog(null, "Account Name: " + Account.getName() + "\nAccount Balance: $" + Account.getBalance());

        // Ask for transaction type
        tempChar = JOptionPane.showInputDialog("What would you like to do today?\nW/w for Withdraw | D/d for Deposit");

        // Check for input and do the action accordingly
        if(tempChar.equalsIgnoreCase("D")) {
            String depositInput = JOptionPane.showInputDialog("How much would you like to Deposit?");
            temp = Double.parseDouble(depositInput);
            Account.Deposit(temp);
            System.out.println();
        }
        else if (tempChar.equalsIgnoreCase("W")) {
            String withdrawInput = JOptionPane.showInputDialog("How much would you like to Withdraw?");
            temp = Double.parseDouble(withdrawInput);
            Account.Withdraw(temp);
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Input, please put W/w for Withdraw | D/d for Deposit!");
        }

        // Create a report after it is done
        JOptionPane.showMessageDialog(null, "Thank you! Here is your report:\nName: " + AccountName + "\nBalance: $" + Account.getBalance());
    }
}