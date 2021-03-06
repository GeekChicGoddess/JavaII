package Contacts;

/**
 * Created by melodytempleton on 6/4/17.
 */

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        return getInt("Please enter an integer: ");
    }

    public static int getInt(String prompt){

        System.out.println(prompt);
        String userInput = scanner.nextLine();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e){
            System.out.println("Sorry, " + userInput + " is not a valid integer");
            return getInt(prompt);
        }
    }

    public static String getString(String prompt){

        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static String getString(){
        return getString("Please enter a string: ");
    }


}
