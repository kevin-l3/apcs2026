
/**
 * Write a description of class BankAccount here.
 *
 * @author Kevin L
 * @version 11/5/25
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
    public double getBalance(){
        return balance;
    }
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
    //mutator method
    public boolean withdraw(double amount){
        if (balance>=amount && amount>0) {
            balance -=amount;
            transactionCount++;
            return true;
        }
        
        return false;
        
    }
    // adds interest to the account balance (mutator method)
    
    public void applyInterest(double annualRate, int months){
        double monthlyRate = (annualRate/100)/12.0;
        for (int m = 1; m<=months; m++){
            balance += balance*monthlyRate;
        }
    }
    
    // the toString method determines what string is returned when you try to print a bankAccount object
    
    public String toString(){
        return "Account: " + this.accountHolder + " | Balance: $" + String.format("%.2f", balance) + " | Transactions: "+this.transactionCount;
    }
}
