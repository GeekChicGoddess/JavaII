/**
 * Created by melodytempleton on 5/19/17.
 */
class Square extends Rectangle{

    private double side;

public Square (double side){

    super(side, side);
    this.side = side;

}

public double getArea(){
    System.out.println("My side for area is " + side);
    return side*side;

}

public double getPerimeter(){
    System.out.println("My side for perimeter is " + side);
    return side * 4;

}


}
