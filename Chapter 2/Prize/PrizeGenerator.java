
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
        System.out.println("how much money do you want to bet?");
        double betAmount = scan.nextDouble();
        if (betAmount>startBalance) {
            System.out.println("you are too broke");
        }
        int higherLower = (int)(Math.random() * 100);
        System.out.print(higherLower);
        
    }
    
}