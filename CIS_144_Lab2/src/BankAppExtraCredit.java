import javax.swing.JOptionPane;

public class BankAppExtraCredit {
    public static void main(String[] args) {
        double temp;
        String tempChar;

        // Get User's Name
        String accountName = JOptionPane.showInputDialog("Enter your Name:");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter the balance in your account:"));
        BankAccount account = new BankAccount(accountName, balance);
        JOptionPane.showMessageDialog(null, "Account Name: " + account.getName() + "\nAccount Balance: $" + account.getBalance());

        // User Menu
        tempChar = JOptionPane.showInputDialog("What would you like to do today?\n(W/w for Withdraw | D/d for Deposit)");

        if (tempChar.equalsIgnoreCase("D")) { // Case-insensitive comparison
            temp = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to deposit?"));

            if (temp > 1000) {
                JOptionPane.showMessageDialog(null, "Transaction Invalid, you cannot deposit more than $1000!");
            } else if (temp > 0) {
                account.Deposit(temp);
                JOptionPane.showMessageDialog(null, "Deposit successful! New Balance: $" + account.getBalance());
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, deposit must be greater than $0!");
            }
        }
        else if (tempChar.equalsIgnoreCase("W")) {
            temp = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to withdraw?"));

            if (temp > 1000) {
                JOptionPane.showMessageDialog(null, "Transaction Invalid, you cannot withdraw more than $1000!");
            } else if (temp > account.getBalance()) {
                JOptionPane.showMessageDialog(null, "Transaction Invalid, you cannot withdraw more than your balance!");
            } else if (temp > 0) {
                account.Withdraw(temp);
                JOptionPane.showMessageDialog(null, "Withdrawal successful! New Balance: $" + account.getBalance());
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, withdrawal must be greater than $0!");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Input, please put W/w for Withdraw | D/d for Deposit!");
        }

        // Final Report
        JOptionPane.showMessageDialog(null, "Thank you! Here is your report:\n" + "Name: " + account.getName() + "\nBalance: $" + account.getBalance());
    }
}

