/**
 * Created by melodytempleton on 5/17/17.
 */
public class CircleApp {

    private static int numberOfCircles = 0;

    public static void makingCircles (){
        boolean keepMakingCircles = true;

        while (keepMakingCircles) {
            Input usersInput = new Input();
            double radius = usersInput.getdouble("Enter the radius of your circle");
            Circle userCircle = new Circle(radius);
            System.out.println("The area is " + userCircle.getArea());
            System.out.println("The circumference is " + userCircle.getCircumference());
            numberOfCircles++;
            keepMakingCircles = usersInput.yesNo("Do you want to make another circle?");
        }

        System.out.println("You have made "+numberOfCircles+" circles.");

    }


    public static void main(String[] args) {

        makingCircles();

    }
}
