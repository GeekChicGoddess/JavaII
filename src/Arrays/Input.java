package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by melodytempleton on 5/16/17.
 */
public class Input {

    public static Scanner scanner; // scanner property/attribute/field

    public Input() {

        this.scanner = new Scanner(System.in); // instance of Object, scanner property set to new instance of Scanner class
    }
    public String getString() {
       return getString("Enter a string");
    };

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    };

    public boolean yesNo() {
       return yesNo("Yes or no?");
    };

    public boolean yesNo(String prompt) {

        String yesOrNoAnswer = getString(prompt);
        if (yesOrNoAnswer.equalsIgnoreCase("y") || yesOrNoAnswer.equalsIgnoreCase("yes")){
            return true;
        }
        else return false;
    };

    public static int getInt (int min, int max){
         return getInt(min, max, "Enter an integer");
    }

    public static int getInt(int min, int max, String prompt) {

        while (true) {
            System.out.println(prompt + " between " + min + " and " + max);

            String userInput = scanner.next();
                try {
                  int userInputToInt =  Integer.valueOf(userInput);

                    if (userInputToInt >= min && userInputToInt <= max) {
                        return userInputToInt;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entry was not an integer");
                }
            }
        }


    public int getInt() {
     return getInt("Enter an interger");
    }

    public int getInt(String prompt) {

        while (true) {
            System.out.println(prompt);
            String input = scanner.next();
            try {
                 return Integer.valueOf(input);
            }
            catch (NumberFormatException e) {
                System.out.println("Entry was not an integer");
            }
        }
    }

    public double getdouble(double min, double max){
       return getdouble(min, max, "Enter a double");
    }


    public double getdouble(double min, double max, String prompt) {

        while(true) {
            System.out.println(prompt + " between " + min + " and " + max);
            String userInput = scanner.next();
            try {
                double userInputToDouble = Integer.valueOf(userInput);
                if (userInputToDouble >= min && userInputToDouble <= max) {
                    return userInputToDouble;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entry was not an double");
            }
        }
    }

    public double getdouble() {
     return getdouble("Enter a double");
    }

    public double getdouble(String prompt) {

        while (true) {

            System.out.println(prompt);
            String userInput = scanner.next();

            try {
                double userInputToDouble = Integer.valueOf(userInput);
                return userInputToDouble;
            }
            catch (NumberFormatException e) {

            }
                System.out.println("Entry was not an double");

            }
        }


    }