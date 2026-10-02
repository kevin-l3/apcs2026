
/**
 * Write a description of class WeatherForcast here.
 *
 * @author kevin
 * @version 10/2/26
 */
public class WeatherForcast
{
    //define an enum for fixed weather categories
    public enum WeatherType {
        Sunny,
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy,
        Monsoon,
        AmarSinghGoyal
    }
    public static void main(String[] args){
        // create a counter variable to count the number of rainy days
        int rainyDays=0;
        //Array of all possible enum constants
        WeatherType[] options = WeatherType.values();
        
        // header parts:
        // initialzer  (int day =1)
        //condition (day<=7)
        //  mutator
        for (int day=1; day<=7; day++) {
            // pick a random index from 0 to the length of our enum
            int rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            System.out.println("Day: " +day+ " Weathertype: "+today);
            if (today  == WeatherType.Rainy){
                rainyDays++;
                
            }
        }
        System.out.println("There are " +rainyDays+" days of rain forcasted");
        System.out.println("All supported weather types: ");
        // an enhanced for loop for each loop
        // iterates directly through every eleement in weather type.values
        for (WeatherType Amar: WeatherType.values()){
            System.out.println("Category: "+Amar);
        }
    }
}