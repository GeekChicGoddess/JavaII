package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by melodytempleton on 5/22/17.
 */
public class GradesApplication {

     public static Scanner scanner = new Scanner(System.in);

    public static  void getStudentInfo(Map <String, Student> list){


        System.out.println("Here are the Github usernames of our students");
       printOutUsernames(list);

    }
    public static void printOutUsernames(Map <String, Student> list){
        list.forEach((k, v) -> {
            System.out.println(k);

        });
        System.out.println("What student would you like to see more information on?");
        String input = scanner.nextLine();
        if (list.get(input) == null){
            System.out.println("Sorry, no student found with the gihub username of \""+ input + "\".");

        }

        else {
            System.out.println("Name :" + list.get(input).getName() + "  - Github Username:  " + input);
            System.out.println("Current Average:  " + list.get(input).getGradeAverage());

        }
        seeAnotherStudent(list);
    }


    public static void seeAnotherStudent(Map <String, Student> list){
        System.out.println("Would you like to see another student?");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            printOutUsernames(list);
        }
        else {
            System.out.println("Goodbye, and have a wonderful day!");
            System.exit(0);
        }
    }




    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        Student joe = new Student("Joe");
        Student jose = new Student("Jose");
        Student jane = new Student("Jane");
        Student julian = new Student("Julian");
        students.put("JoLo", joe);
        students.put("AFineJose", jose);
        students.put("Janiac", jane);
        students.put("Joolean", julian);

        joe.addGrade(45);
        joe.addGrade(75);
        joe.addGrade(60);
        jose.addGrade(67);
        jose.addGrade(98);
        jose.addGrade(87);
        jane.addGrade(90);
        jane.addGrade(70);
        jane.addGrade(80);
        julian.addGrade(90);
        julian.addGrade(95);
        julian.addGrade(97);

        System.out.println("Welcome");
        getStudentInfo(students);


    }



}
