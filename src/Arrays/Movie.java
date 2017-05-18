package Arrays;

/**
 * Created by melodytempleton on 5/18/17.
 */
public class Movie {


    private String name = "";
    private String category = "";

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }


    public String getName(){
        String moveieName = this.name;
        return moveieName;
    }

    public String getCategory(){
        String movieCategory = this.category;
        return movieCategory;
    }


}