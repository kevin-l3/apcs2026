/**
 * weekly budget
 * kevin
 * last updated : 8/25/2026
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class week_budget
{
    //calculate weekly lunch spending and remaining money
    public static void main(String[] args) {
        
        String name; 
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // instantiate (to create) the scanner object to read from the keyboard
        Scanner scan = new Scanner(System.in);
        // read a string (object)
        System.out.println("enter your name: ");
        name = scan.nextLine();
        System.out.println("your name is: " + name);
        // read doubles (floaitng point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter price of school lunch: $");
        lunchPrice = scan.nextDouble();
        // read integer
        System.out.print("Enter the number of school lunches you have ordered the week:");
        lunchesPerWeek = scan.nextInt();
        // Perform calcluatilations ( arhtimetic expressions)
        totalCost = lunchPrice * lunchesPerWeek;
        remaining = allowance - totalCost;
        // printf allows placeholders for strings using %s
        System.out.printf("%n--- Weekly budget summary for %s ---%n", name);
        
        System.out.printf("%-25s %s%n", "Weekly allowance: " , money.format(allowance));
        System.out.printf("%-25s %s%n", "total spent on lunches: " , money.format(totalCost));
        System.out.printf("%-25s %s%n", "Money remaining: " , money.format(remaining));
        
        
    }
    }