package Arrays;

/**
 * Created by melodytempleton on 5/18/17.
 */
public class NameGenerator {


    public static String[] adjectives = {"Slimey", "Shiney", "Awesome", "Rank", "Bodacious", "Baka", "Hella", "Plain", "Cranky", "Floozy"};


    public static String[] nouns = {"Moonbeam", "Pavement", "Tissue", "Tomcat", "Capacitor", "Mousepad", "Ponytail", "Buzzcut", "Biscuit", "Flamingo"};


    public static String selectRandomlyFromArray(String[] array) {

        int randomSelector = (int) Math.floor(Math.random() * nouns.length);
        return array[randomSelector];

    }

    public static String generateAName (String[] array1, String[] array2){

        String yourNameIs = "Your name is " + selectRandomlyFromArray(array1) + " " + selectRandomlyFromArray(array2);
        return yourNameIs;
    }


    public static void main(String[] args) {

        System.out.println(generateAName(adjectives, nouns));

    }

}
