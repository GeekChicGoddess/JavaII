/**
 * Created by melodytempleton on 5/19/17.
 */
public class Rectangle extends Quadralateral implements Measurable{


    public Rectangle(double width, double length) {
        super(width, length);
    }

    public double setWidth(double width){
        this.width = width;
        return width;
    }


    @Override
    public double getPerimeter() {
        return (2* width) + (2*length);
    }

    @Override
    public double getArea() {
        return (width*length);
    }

    @Override
    public double setWidth() {
        return 0;
    }

    @Override
    public double setLength() {
        return 0;
    }
}
