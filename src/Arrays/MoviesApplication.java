//package Arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * Created by melodytempleton on 5/18/17.
// */
//
//
//public class MoviesApplication {
//
//
//
//    public static Input viewerInput = new Input();
//
//
//    public static int displayMenu(){ // show the menu to the viewer and ask for choice
//        String menu = "What would you like to do?\n" +
//                "\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category\n"+
//                "6 - view movies in the musical category\n"+
//                "7 - add a movie to the list";
//        System.out.println(menu);
//        return viewerInput.getInt(0, 7, "Please enter menu choice");
//    }
//
//    public static void viewTheMovies(Movie[] movieList){
//
//        for(int i = 0; i < movieList.length; i++) {
//            System.out.printf("%-40s%s%n", movieList[i].getName(), movieList[i].getCategory());
//        }
//        runMovieApplication(movieList);
//    }
//
//    public static void viewTheMovies(Movie[] movieList, String category){
//
//        for(int i = 0; i < movieList.length; i++) {
//            if (movieList[i].getCategory().equals(category)) {
//                System.out.printf("%-40s%s%n", movieList[i].getName(), movieList[i].getCategory());
//            }
//        }
//        runMovieApplication(movieList);
//    }
//
//    public static void addAMovie (Movie [] movieList){
//
//        String filmName = viewerInput.getString("What is the name of the film?");
//
//        String filmCategory = viewerInput.getString("What is the category?");
//
//        movieList = Arrays.copyOf(movieList, movieList.length+1);
//
//        movieList[movieList.length-1]= new Movie (filmName, filmCategory);
//
//        System.out.println("Here is the new movie list");
//        viewTheMovies(movieList);
//        displayMenu();
//
//    }
//
//    public static void runMovieApplication(Movie[] movieList){
//
//        int option = displayMenu();
//
//        switch (option){
//            case 0:
//                System.exit(0);
//            case 1:
//                viewTheMovies(movieList);
//                break;
//            case 2:
//                viewTheMovies(movieList, "animated");
//                break;
//            case 3:
//                viewTheMovies(movieList, "drama");
//                break;
//            case 4:
//                viewTheMovies(movieList, "horror");
//                break;
//            case 5:
//                viewTheMovies(movieList, "scifi");
//                break;
//            case 6:
//                viewTheMovies(movieList, "musical");
//                break;
//            case 7 :
//                addAMovie(movieList);
//                break;
//        }
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//        Movie[] allMovies = MoviesArray.findAll();
//
//        runMovieApplication(allMovies);
//
//
//
//
//    }
//}
