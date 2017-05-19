/**
 * Created by melodytempleton on 5/19/17.
 */
class Square extends Quadralateral{


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return (4*width);
    }

    @Override
    public double getArea() {
        return width * width;
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
