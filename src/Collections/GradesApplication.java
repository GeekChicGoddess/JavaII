package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by melodytempleton on 5/22/17.
 */
public class GradesApplication {

    public static void main(String[] args) {
        Map<String, Student> student = new HashMap<>();

        Student joe = new Student("Joe");
        Student jane = new Student("Jane");
        student.put("github.com/JoLo", joe);
        student.put("github.com/AFineJose", (new Student("Jose")));
        student.put("github.com/Janiac", jane);
        student.put("github.com/Joolean", (new Student("Julian")));

        joe.addGrade(45);
        joe.addGrade(75);
        joe.addGrade(60);
        student.get("github.com/AFineJose").addGrade(67);
        student.get("github.com/AFineJose").addGrade(98);
        student.get("github.com/AFineJose").addGrade(87);
        jane.addGrade(90);
        jane.addGrade(70);
        jane.addGrade(80);
        student.get("github.com/Joolean").addGrade(90);
        student.get("github.com/Joolean").addGrade(95);
        student.get("github.com/Joolean").addGrade(97);

    }

}
