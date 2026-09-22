
/**
 * MovieTickerPricer
 *
 * Kevin Luo
 * 9/21/26
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class MovieTicketPricer
{
    public static void main(String[] args) {
    // create constant varibales can't be changed
    final double REGULAR_PRICE = 12.50;
    final double DISCOUNT_PRICE = 8.00;
    final double IMAX_SURCHARGE = 5.00;
    final double IMAX_70MM_SURCHARGE = 8.00;
    
    Scanner scan = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    System.out.println("---Movie Ticket Calculator---");
    System.out.println("Enter the Customer's age: ");
    int age = scan.nextInt();
    System.out.println("1 - Standard Format");
    System.out.println("2 - IMAX");
    System.out.println("3 - IMAX 70mm (As Nolan Intended)");
    System.out.println("Enter choice (1-3): ");
    int format = scan.nextInt();
    
    
    
    System.out.print("Is this a matinee showtime? (y/n)" );
    String isMatinee = scan.next();
    boolean matinee = false;
    if (isMatinee.toLowerCase().equals("y")); {
        matinee = true;
    }
    System.out.print("Does the customer have a pass? (y/n)" );
    String hasPass = scan.next();
    //way to not use if statements
    boolean pass = hasPass.toLowerCase().equals("y");
    
    double ticketPrice;
    
    // Discount applies if <13 , >=65 or its a matinee and have a pass
    if (format == 1){
    
        if (age<13 || age>=65 || (matinee && pass)) {
            ticketPrice= DISCOUNT_PRICE;
            System.out.println("Status: Discount Applied!");
            
            
        }
        else {
            ticketPrice = REGULAR_PRICE;
            System.out.println("Status: Regular rate applied.");
            
        }
    }
    else if (format==2){
        ticketPrice = REGULAR_PRICE + IMAX_SURCHARGE;
        System.out.println("Status: IMAX Surcharge Applied");
    }
    else if (format==3){
        ticketPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;
        System.out.println("Status: IMAX 70mm Surcharge Applied.");
    }
    else {
        ticketPrice = REGULAR_PRICE;
        System.out.println("Status: Incorrect entry. Regular Price Applied.");
    }
    
    System.out.println("Total due: " + money.format(ticketPrice));
}
}

