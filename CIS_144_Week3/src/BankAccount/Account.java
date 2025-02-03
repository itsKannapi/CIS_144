// Fig: 3.1 Account Java
// Account class that contains an name instance variable
// and methods to set and its value

package BankAccount;

public class Account {
    //instance variable
    private String name;

    //method to get the name in the object
    public String getName() {
        return name; // return the value of name to caller
    }

    // method to set the name in the object
    public void setName(String name) {
        this.name = name; // store the name
    }
}
