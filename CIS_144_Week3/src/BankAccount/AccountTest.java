package BankAccount;
// Fig. 3.2: Account Test.java
// Creating and manipulating an Account object.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        // create an Account object and assign it to my Account
        Account myAccount = new Account();
        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        // prompt for and read name
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // read a line of text
        myAccount.setName(theName); // put theName in my Account
        System.out.println(); // outputs a blank line
        // display the name stored in object my Account
        System.out.printf("Name in object mry Account is:%n%s%n", myAccount.getName()); // end class Account Test
    }
}