
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    // create the class variables
    private String accountHolder;
    private double balance;
    private int transactionCount;
    //constant definition
    private static final double MIN_BALANCE = 0.0;
    // create the class constructors
    public BankAccount(){
        // "this" refers to the current instance of the class (object)
        this.accountHolder = "Unnamed";
        this.balance = 0.0;
        this.transactionCount = 0;
    }
    // overloaded constructor with parameters
    
    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        if (initialBalance>=BankAccount.MIN_BALANCE){
            this.balance = initialBalance;
        }
        else{
            this.balance=MIN_BALANCE;
        }
        this.transactionCount = 0;
    }
    
    //withdraw the given amount
    
    public boolean withdraw(double amount){
        if (balance>=amount && amount>0) {
            balance -=amount;
            transactionCount++;
            return true;
        }
        
        return false;
        
    }
}
