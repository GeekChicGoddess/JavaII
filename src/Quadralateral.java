/**
 * Created by melodytempleton on 5/19/17.
 */
abstract class Quadralateral extends Shape implements Measurable {


    protected double width;
    protected double length;

    public Quadralateral (double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public abstract double setWidth(double width);

    public abstract double setLength(double length);



}
