import java.util.Scanner;

/**
 * 
 * Kevin Luo
 * Last editied: 8/31/26
 */
public class TextTransformer
{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Welcome to Text Transfmorerm");
        System.out.println("==============================");
        
        System.out.print("Enter a Motivational quote: ");
        String phrase = scan.nextLine();
        
        int phraseLength = phrase.length();
        System.out.println("Total Characters (including spaces) is: " + phraseLength);
        // The prelace method returns a new version of the old string
        // and repalces the first charachter with the second character
        // the original string is NOT modified
        String securePhrase = phrase.replace('e', '3');
        securePhrase = securePhrase.replace('a', '@');
        System.out.println("Modified Phrase: " + securePhrase);
        System.out.println("Original Phrase: " + phrase);

        // Get the first 5 characters of our string
        // Index# 0123456789
        //Substring returns from first index (inclusve)
        // to the second index (exclusive)
        String prefix = phrase.substring(0,5);
        System.out.println("First 5 characters: " + prefix);
        // everyhing after 5
        String remainder = phrase.substring(5);
        System.out.println("Remaining Characters: " + remainder);
        
        
        
        
    }
}