/**
 * weekly budget
 * kevin
 * last updated : 8/21/2026
 */
import java.util.Scanner;
public class week_budget
{
    //calculate weekly lunch spending and remaining money
    public static void main(String[] args) {
        
        String name; 
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
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
        
        totalCost = lunchPrice * lunchesPerWeek;
        if (totalCost>allowance){
            System.out.println("broke ahh");
        }
        else { 
                System.out.println("nice");
        }
        
    }
    }