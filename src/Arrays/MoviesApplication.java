package Arrays;

import java.util.Arrays;

/**
 * Created by melodytempleton on 5/18/17.
 */


public class MoviesApplication {



   public static Input viewerInput = new Input();
    private static Movie[] movieList;

    public static int displayMenu(){ // show the menu to the viewer and ask for choice
        String menu = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n"+
                "6 - view movies in the musical category";
        System.out.println(menu);
        return viewerInput.getInt(0, 6, "Please enter menu choice");
    }

    public static void viewTheMovies(Movie[] movieList){

        for(int i = 0; i < movieList.length; i++) {
                System.out.printf("%-40s%s%n", movieList[i].getName(), movieList[i].getCategory());
            }
            runMovieApplication(movieList);
    }

    public static void viewTheMovies(Movie[] movieList, String category){

        for(int i = 0; i < movieList.length; i++) {
            if (movieList[i].getCategory().equals(category)) {
                System.out.printf("%-40s%s%n", movieList[i].getName(), movieList[i].getCategory());
            }
        }
        runMovieApplication(movieList);
    }

    public static void runMovieApplication(Movie[] movieList){

        int option = displayMenu();

        switch (option){
             case 0:
                 System.exit(0);
             case 1:
                 viewTheMovies(movieList);
             case 2:
                 viewTheMovies(movieList, "animated");
             case 3:
                viewTheMovies(movieList, "drama");
             case 4:
                 viewTheMovies(movieList, "horror");
             case 5:
                 viewTheMovies(movieList, "scifi");
             case 6:
                 viewTheMovies(movieList, "musical");
     }


    }


    public static void main(String[] args) {

        Movie[] allMovies = MoviesArray.findAll();

        runMovieApplication(allMovies);




    }
}
