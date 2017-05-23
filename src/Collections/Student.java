package Collections;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

/**
 * Created by melodytempleton on 5/22/17.
 */
public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;

    }

    public void printGrades(){
        for (double grade : grades){
            System.out.println(grade);
        }

    }

    // adds the given grade to the grades property
    public void addGrade(double grade){
        grades.add(grade);

    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeTotal = 0;
        for (double grade : grades) {
            gradeTotal+= grade;
        }
        return gradeTotal / grades.size();
    }

    public static void main(String[] args) {
        Student melody = new Student("Melody");

        System.out.println(melody.getName());
        melody.addGrade(100);
        melody.addGrade(90);
        melody.addGrade(95);
        melody.addGrade(93);
        melody.addGrade(90);

        System.out.println(melody.getGradeAverage());

        Student joe = new Student("Joe");
        System.out.println(joe.getName());
        joe.addGrade(50);
        joe.addGrade(100);
        System.out.println(joe.getGradeAverage());


    }

}
