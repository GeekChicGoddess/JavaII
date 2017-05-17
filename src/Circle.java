/**
 * Created by melodytempleton on 5/17/17.
 */
public class Circle {

    private double radius; // radius property/attribute/field


    public Circle(double radius){

    this.radius = radius;

    }

    public double getArea(){
        double area = Math.pow(radius, 2) * 3.14;
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

}
