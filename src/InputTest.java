import Arrays.Input;

/**
 * Created by melodytempleton on 5/16/17.
 */


public class InputTest {


    public static void main(String[] args) {

        Input test = new Input();
        System.out.println(test.getString());
        System.out.println(test.getString("Please enter a string"));
        System.out.println(test.yesNo());
        System.out.println(test.yesNo("Please answer yes or no"));
        System.out.println(test.getInt(2, 8));
        System.out.println(test.getInt());
        System.out.println(test.getInt("Please enter an integer"));
        System.out.println(test.getdouble(3.25, 5.5));
        System.out.println(test.getdouble());


    }

}
