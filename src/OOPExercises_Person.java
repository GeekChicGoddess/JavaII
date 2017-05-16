/**
 * Created by melodytempleton on 5/16/17.
 */
public class OOPExercises_Person {

    private String name = "private name";

    // returns the person's name
    public String getName(){
        return this.name;
    };
    // changes the name property to the passed value
    public void setName(String passName){
        this.name = passName;
    };
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello "+ name);
    };

    public OOPExercises_Person (String name){
        this.name = name;
    }



    public static void main(String[] args) {

        OOPExercises_Person Melody = new OOPExercises_Person("Melody");

        Melody.sayHello();
        System.out.println(Melody.name);
        System.out.println(Melody.getName());

        Melody.name = "NewName";
        Melody.setName("Crystal");
        Melody.sayHello();

    }
}
