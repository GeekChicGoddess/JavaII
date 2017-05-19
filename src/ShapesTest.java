/**
 * Created by melodytempleton on 5/19/17.
 */
public class ShapesTest {





        Square mySquare = new Square(5);
        Rectangle myRectangle = new Rectangle(4, 2);



    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(3,4);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());





    }
}
