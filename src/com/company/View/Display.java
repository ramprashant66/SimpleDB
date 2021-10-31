package com.company.View;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import com.company.Model.Movie;

public class Display
{
    //This block sets the movie title
    public static String setMovieName(String title)
    {
        Scanner scan = new Scanner(System.in);  //new object of Scanner type
        System.out.println("Enter a movie name to add to the database: ");      //prompt
        title = scan.nextLine();        //storing the input into title

        return title;       //return to the caller
    }

    //This block sets the movie release year
    public static String setReleaseYear(String releaseYear)
    {
        Scanner scan = new Scanner(System.in);  //new object of Scanner type
        System.out.println("Enter the movie's release year to be added to the database: ");     //prompt
        releaseYear = scan.nextLine();      //storing the input into releaseYear

        return releaseYear;     //return to the caller
    }

    //This block sets the movie ratings
    public static String setRating(String rating)
    {
        Scanner scan = new Scanner(System.in);      //new object of Scanner type
        System.out.println("Enter the movie's rating to be added to the database: ");   //prompt
        rating = scan.nextLine();       //storing the input into rating

        return rating;      //return to the caller
    }

    //This block gets the user input to stop entering data
    public static String endInput()
    {
        Scanner scan = new Scanner(System.in);      //new object of Scanner type
        String input = "Y";                         //variable to test for the loop in main
        System.out.println("Stop entering data? ");     //prompt
        input = scan.nextLine();                        //storing the input into input
        input = input.toUpperCase();                    //changing the input into uppercase

        //This block input validates of what was entered into the input variable
        while (!((input.equals("N")) || (input.equals("Y"))))       //must be only "N" or "Y"
        {
            System.out.println("Incorrect entry..Try again...");    //display error message
            System.out.print("Anymore data? ");     //prompt
            input = scan.nextLine();        //take input again
            input = input.toUpperCase();        //change to uppercase
        }

        return input;       //return to the caller
    }

    //This block prints out the elements from the arrayList
    public static void displayRecord(ArrayList<Movie> theMovies)
    {
        //enhanced for loop
        for(Movie movie : theMovies){
            System.out.println(movie.toString());
        }
    }

}//end class Display
