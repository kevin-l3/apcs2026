import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

/**
 * Write a description of class LedgerProcessor here.
 *
 * @author Kevin L
 * @version 9/30/26
 */
public class LedgerProcessor
{ 
    // adding throws allows java to handle an error
public static void main(String[] args) throws FileNotFoundException{
    //connecy scanner to an external file; in the same project
    File dataFile = new File("transactions.txt");
    Scanner fileScan = new Scanner(dataFile);
    
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    // counter and accumulator variables
    int count = 0;
    double totalSales=0.0;
    
    System.out.println("===== Daily Transaction Ledger =====");
    //Loop will run while there is another left in the file
    
    while (fileScan.hasNextLine()){
        String line = fileScan.nextLine();
        double price = Double.parseDouble(line);
        
        // update our counter and accumulator
        count ++;
        totalSales+=price;
        
        System.out.println("Transaction #"+count+": "+money.format(price));
        
    }
    // always close file streams when finished
    
    fileScan.close();
    double averageSales = totalSales/count;
    System.out.println("Total Items Sold: " + count);
    System.out.println("Total Revenue " + money.format(totalSales));
    System.out.println("Average Transaction: " + money.format(averageSales));
}
    }

