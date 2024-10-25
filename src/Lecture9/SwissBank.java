package Lecture9;
class SwissBankAccount {
    private String accountHolder;
    private double balance;

    //TODO: create two constructors both with starting balance.
    // One for anonymous accounts that sets a default name and and one for named) (OVERLOAD)

    public SwissBankAccount(int startingBalance, String accountHolder){
        this.balance = startingBalance;
        this.accountHolder = accountHolder;
    }

    public SwissBankAccount(int balance){
        this.balance = balance;
        this.accountHolder = "Anonymous";
    }


    public void deposit(double amount){
        this.balance += amount;
        //TODO:  complete logic and overload this method with being able to deposit via int as well. (OVERLOAD)
    }
    public void deposit(int amount){
        this.balance += amount;
    }

    //TODO: create a tostring method (TOSTRING)

    public String toString(){
        return this.accountHolder + " " + this.balance;
    }

    //TODO: create two similar withdraw functions (OVERLOAD)
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void withdraw(int amount){
        this.balance -= amount;
    }

    //TODO: create a method totally legal transfer between two accounts by using another swissBankAccount as a parameter
    // to withdraw from. Use the withdraw and deposit methods. (REFERENCE)
    public void transfer(int amount, SwissBankAccount recipient){
        this.withdraw(amount);
        recipient.deposit(amount);
    }


}

public class SwissBank {
    public static void main(String[] args) {

        SwissBankAccount hemelig = new SwissBankAccount(1_000_000);
        SwissBankAccount ikkeHemmelig = new SwissBankAccount(1_000, "Tom Glover");
        System.out.println(hemelig);
        System.out.println(ikkeHemmelig);

        hemelig.transfer(50000, ikkeHemmelig);

        System.out.println(hemelig);
        System.out.println(ikkeHemmelig);

        //TODO: Print the before and after status of both accounts.
        //TODO: do so while the toString method is commented out, what happened?

        //TODO: harder task: create two anonymous methods where the owner is the variable name of the SwissBankAccount
        // switch ownership of the two anonymous accounts by changing the references.
        // make sure there is no evidence of this account transfer

        SwissBankAccount Trump = new SwissBankAccount(50000);
        SwissBankAccount Musk = new SwissBankAccount(1000000);

        SwissBankAccount temp = Trump;
        Trump = Musk;
        Musk = temp;

        System.out.println("Trump" + Trump);
        System.out.println("Musk" + Musk);
    }

}
