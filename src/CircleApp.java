/**
 * Created by melodytempleton on 5/17/17.
 */
public class CircleApp {

    public static void main(String[] args) {
        Input usersInput = new Input();
        double radius = usersInput.getdouble("Enter the radius of your circle");
        Circle userCircle = new Circle(radius);
        System.out.println("The area is " + userCircle.getArea());
        System.out.println("The circumference is " + userCircle.getCircumference());
    }
}
