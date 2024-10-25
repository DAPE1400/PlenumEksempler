package Lecture9;
class SwissBankAccount {
    private String accountHolder;
    private double balance;

    //TODO: create two constructors both with starting balance.
    // One for anonymous accounts that sets a default name and and one for named) (OVERLOAD)


    public void deposit(double amount){
        //TODO:  complete logic and overload this method with being able to deposit via int as well. (OVERLOAD)
    }

    //TODO: create a tostring method (TOSTRING)

    //TODO: create two similar withdraw functions (OVERLOAD)

    //TODO: create a method totally legal transfer between two accounts by using another swissBankAccount as a parameter
    // to withdraw from. Use the withdraw and deposit methods. (REFERENCE)


}

public class SwissBank {
    //TODO: create two bank accounts one anonymous, and transfer some totally legal founds between the two.
    //TODO: Print the before and after status of both accounts.
    //TODO: do so while the toString method is commented out, what happened?

    //TODO: harder task: create two anonymous methods where the owner is the variable name of the SwissBankAccount
    // switch ownership of the two anonymous accounts by changing the references.
}
