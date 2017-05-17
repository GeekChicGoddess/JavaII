/**
 * Created by melodytempleton on 5/16/17.
 */
public class Person {

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

    public Person(String name){
        this.name = name;
    }



    public static void main(String[] args) {

        Person Melody = new Person("Melody");

        Melody.sayHello();
        System.out.println(Melody.name);
        System.out.println(Melody.getName());

        Melody.name = "NewName";
        Melody.setName("Crystal");
        Melody.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
