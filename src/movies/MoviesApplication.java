package movies;
import java.util.Scanner;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
        int choice;

        do{
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("0 - exit");
                    break;
                case 1:
                    System.out.println("View all movies");
                    displayMovie(movies);
                    break;
                case 2:
                    System.out.println("View movies in the animated category");
                    displayMovieByCategory(movies, "animated");
                    break;
                case 3:
                    System.out.println("View movies in the drama category");
                    displayMovieByCategory(movies, "drama");
                    break;
                case 4:
                    System.out.println("View movies in the horror category");
                    displayMovieByCategory(movies, "horror");
                    break;
                case 5:
                    System.out.println("View movies in the scifi category");
                    displayMovieByCategory(movies, "scifi");
                    break;
                default:
                    System.out.println("INVALID");
            }
        }while(choice != 0);
    }
    public static void displayMovie(Movie[] movies){
        for(Movie movie: movies){
            System.out.println(movie.getName()+" -- " + movie.getCategory());
        }
    }
    public static void displayMovieByCategory(Movie[] movies, String categories){
        for (Movie movie: movies){
            if(movie.getCategory().equalsIgnoreCase(categories)){
                System.out.println(movie.getName()+" -- " + movie.getCategory());
            }
        }
    }
}
