
/**
 * Write a description of class BankDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankDriver
{
    public static void main(String[] args){
        // Create BankAccount objects using constructors
        BankAccount acc1 = new BankAccount("Kevin L", 10001.57);
        BankAccount acc2 = new BankAccount(); // uses the defult constructor
        
        // acc1.getBalance() = 5000.0;
        if (acc1.withdraw(250.00)==true){
            System.out.println("Withdrawed: You have $"+acc1.getBalance()+" left in the account");
        }
        else{
            System.out.println("broke");
        }
        // bc boolean don't need ==true
        if (acc2.withdraw(250.00)){
            System.out.println("Withdrawed");
        }
        else{
            System.out.println("broke");
        }
        
        
        acc1.applyInterest(7.3,12); // 7.3% annual rate
        
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
