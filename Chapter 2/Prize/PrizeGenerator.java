
/**
 * Write a description of class PrizeGenerator here.
 *
 * kevin
 * Date modified: 8/26/2026
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;

public class PrizeGenerator
{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("welcome to the APCSA prize simulator!");
        System.out.println("-------------------------------------");
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("how much money do you have? $");
        double startBalance = scan.nextDouble();
        
        // Generate a random cash prize from 10-100 dollas
        // Math.random genearates a number between 0 and 1
        int prizeAmount = 10 + (int) (Math.random() * 91);
        System.out.println("the cash prize is: " + prizeAmount);
        int fee = 1 + (int)(Math.random() * 5);
        // this is allowed as no infomraiton would be lost.
        double finalBalance = startBalance + prizeAmount - fee;
        
        System.out.println("\n Congratulation " + name + "! Here is your statement: ");
        System.out.println("================================================");
        
        System.out.printf("%-25s %s%n", "Starting Blance" , money.format(startBalance));
        System.out.printf("%-25s %s%n", "Prize Money" , money.format(prizeAmount));
        System.out.printf("%-25s %s%n", "Processing fee" , money.format(fee));
        System.out.println("-----------------------------------");
        System.out.printf("%-25s %s%n" , "final balnce" , money.format(finalBalance));
        System.out.println("================================================");
        
    
        
        
        
    }
    
}