package com.company.Controller;

import com.company.Model.Movie;
import com.company.View.Display;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String name = "";           //for movie name
        String year = "";           //for year released
        String rate = "";           //for movie rating
        String endInput = "N";      //whether to stop input taking or not

        DBConnect db = new DBConnect("movies.db");
        db.createNewDatabase();
        db.addTables();

        while ((!(endInput.equals("Y"))))       //keep taking input until the user has no more data to input
        {
            name = Display.setMovieName(name);      //sets movie title
            year = Display.setReleaseYear(year);    //sets year released
            rate = Display.setRating(rate);         //sets movie rating
            db.addData(name, year, rate);           //adding data to the database

            endInput = Display.endInput();          //take input whether there is more data to input or not
        }

        ArrayList<Movie> theMovies = db.getData();

        Display.displayRecord(theMovies); //prints out the arrayList of records

    }
}
