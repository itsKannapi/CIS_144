import javax.swing.JOptionPane;
public class BankAccount {
    private String Name;
    private double balance;
    public BankAccount(String name) {
        Name = name;
    }
    public BankAccount(String name, double balance) {
        Name = name;
        this.balance = balance;
    }
    public void Withdraw(double w){
        if (w > 1000) {
            System.out.println("Transaction Invalid, you cannot Withdraw more than $1000!");
        } else if (w < 1000) {
            balance -= w;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input, please input an integer!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Deposit(double d) {
        if (d >= 1000) {
            System.out.println("Transaction Invalid, you cannot deposit more than $1000!");
        } else if (d < 1000) {
            balance += d;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input, please input an integer!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}