import java.util.Scanner;

/**
 * Write a description of class TextInspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextInspector
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Text Inspector ===");
        System.out.print("Please enter a word or phrase: ");
        
        String text = scan.nextLine();
        // Determine the length of the word/phrase
        System.out.println("Total length: "+text.length());
        
        //count the vowels in the word/phrase
        int count = 0;
        String vowels = "aeiou";
        
        for (int i =0; i<text.length(); i++){
            // extract a single character using substring
            
            String ch = text.substring(i,i+1);
            
            // indexof checks if a string is within another string
            
            if (vowels.indexOf(ch.toLowerCase()) !=-1){
                count++;
            }
        }
        System.out.println("Vowel Count: " + count);
        // search out word phrase for a give word phrase
        
        System.out.print("Please Enter a seach term: ");
        String searchTerm = scan.nextLine();
        
        int foundIndex = text.indexOf(searchTerm);
        if (foundIndex!=-1) {
            // extract from found index to the end of the string
            String remainingText = text.substring(foundIndex);
            System.out.println(remainingText);
        }
        
        System.out.print("Please enter a second word/phrase to compare: ");
        String secondWord = scan.nextLine();
        
        // test if the strings are equal
        
        if (text.equals(secondWord)) {
            System.out.println("The two words/phrases are equal.");
        }
        else {
            // test alphabetical ordering using compareTo
            int cmp  = text.compareTo(secondWord);
            if (cmp<0){
                System.out.println(text + " comes BEFORE " +secondWord);
                
            }
            else {
                                System.out.println(text + " comes AFTER " +secondWord);

            }
        }
    }
}