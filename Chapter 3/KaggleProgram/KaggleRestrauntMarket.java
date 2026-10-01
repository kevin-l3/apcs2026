import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
/**
 * Average age of a person with with sleep issues
 *
 * @author Kevin L
 * @version 10/1/26
 */
public class KaggleRestrauntMarket
{public static void main(String[] args) throws FileNotFoundException{
    //connecy scanner to an external file; in the same project
    File dataFile = new File("Doc.txt");
    Scanner fileScan = new Scanner(dataFile);
    File dataFile1 = new File("SleepSchedule.txt");
    Scanner fileScan1 = new Scanner(dataFile1);
    
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    // counter and accumulator variables
    int count = 0;
    int age=0;
    int sleepAmount = 0;
    
    
    System.out.println("===== Daily Transaction Ledger =====");
    //Loop will run while there is another left in the file
    
    while (fileScan.hasNextLine()){
        String line = fileScan.nextLine();
        int price = (int) Double.parseDouble(line);
        
        // update our counter and accumulator
        count ++;
        age+=price;
        
        String line1 = fileScan1.nextLine();
        int price1 = (int) Double.parseDouble(line1);
        
        // update our counter and accumulator
        
        sleepAmount+=price1;
        
        System.out.println("Person #"+count+", Age: " +price+", Time on Phone (minutes): " +price1);
        
    }
       // always close file streams when finished
    
    fileScan.close();
    fileScan1.close();
   int averageAge = age/count;
    System.out.println("Total People: " + count);
    System.out.println("The Average age is: " + averageAge); 
    System.out.println("Average time on phone is: " + (sleepAmount/count) + " Minutes.");
        
   
        
    }
    
    }


