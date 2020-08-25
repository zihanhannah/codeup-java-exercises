package movies;

import util.Input;

import java.util.Arrays;

//Create a class named MoviesApplication that has a main method.
public class MoviesApplication {
    public static void main(String[] args) {
//Give the user a list of options for viewing all the movies or viewing movies by category.
        Input input = new Input();
        boolean ifContinue = true;
        Movie[] movies = MoviesArray.findAll();

        while (ifContinue) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            int num = input.getInt(0, 5);
            if (num == 0) {
                ifContinue = false;
                System.out.println("Exit");
            } else if (num == 1) {
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + "--" + movie.getCategory());
                }
            } else if (num == 2) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
            } else if (num == 3) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
            } else if (num == 4) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }

                }
            } else if (num == 5) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
            }
        }

    }
}