import java.util.Scanner;

/**
 * Created by melodytempleton on 5/16/17.
 */
public class Input {

    private Scanner scanner; // scanner property/attribute/field

    public Input() {

        scanner = new Scanner(System.in); // instance of Object, scanner property set to new instance of Scanner class
    }
    public String getString() {
        System.out.println("Enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    };

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    };

    public boolean yesNo() {
        System.out.println("Yes or no?");
        String yesOrNoAnswer = scanner.next();
        if (yesOrNoAnswer.equalsIgnoreCase("y") || yesOrNoAnswer.equalsIgnoreCase("yes")){
            return true;
        }
        else return false;
    };

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String yesOrNoAnswer = scanner.next();
        if (yesOrNoAnswer.equalsIgnoreCase("y") || yesOrNoAnswer.equalsIgnoreCase("yes")){
            return true;
        }
        else return false;
    };

    public int getInt(int min, int max) {
        boolean userGotItRight = false;
        int userInput =0;
        do {
            System.out.println("Enter an interger between " + min + " and " + max);

            if(scanner.hasNextInt()) {//<-- get in if its a number
                userInput = scanner.nextInt();
                if (userInput >= min && userInput <= max){
                    userGotItRight = true;
                    return userInput;
                }
            }
            else {
                scanner.next();
            };
        }while (!userGotItRight);
        return userInput;
    }

    public int getInt() {
        boolean userGotItRight = false;
        int userInput=0;
        do {
            System.out.println("Enter an interger");
            if (scanner.hasNextInt()) {//<-- get in if its a number
                userInput = scanner.nextInt();
                userGotItRight = true;
            } else {
                scanner.next();
            }
        } while (!userGotItRight);

        return userInput;
    }

    public int getInt(String prompt) {
        boolean userGotItRight = false;
        int userInput=0;
        do {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {//<-- get in if its a number
                userInput = scanner.nextInt();
                userGotItRight = true;
            } else {
                scanner.next();
            }
        } while (!userGotItRight);

        return userInput;
    }

    public double getdouble(double min, double max) {

        boolean userGotItRight = false;
        double userInput=0;

        do {
            System.out.println("Enter a double between " + min + " and " + max);

            if(scanner.hasNextDouble()) {//<-- get in if its a double
                userInput = scanner.nextDouble();
                if (userInput >= min && userInput <= max){
                    userGotItRight = true;

                }
            }
            else {
                scanner.next();
            };
        }while (!userGotItRight);

        return userInput;
    }

    public double getdouble() {
        boolean userGotItRight = false;
        double userInput=0;

        do {
            System.out.println("Enter a double");

            if(scanner.hasNextDouble()) {//<-- get in if its a double
                userInput = scanner.nextDouble();
                    userGotItRight = true;
                }
            else {
                scanner.next();
            };
        }while (!userGotItRight);

        return userInput;
    }


}
