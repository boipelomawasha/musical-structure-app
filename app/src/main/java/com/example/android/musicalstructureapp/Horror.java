package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Horror extends AppCompatActivity {

    // Create private list of audiobooks
    private ArrayList<AudioBook> audioBooks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audiobook_list_view);

        //Add audiobooks
        addAudiobooks();

        // Create instance AudioBook adapter with the ArrayList and context
        AudioBookAdapter myAdapter = new AudioBookAdapter(this, audioBooks);

        // Locate the ListView to use
        ListView listView = findViewById(R.id.abList);

        // MAke use of the adapter in your ListView instance
        listView.setAdapter(myAdapter);

    }

    private void addAudiobooks() {

        audioBooks.add(new AudioBook("The Crooked Staircase", "Elisabeth Rodgers", "15 hours 37 minutes", "May 2018"));
        audioBooks.add(new AudioBook("Unwelcome Guests", "Cat Gould", "6 hours 41 minutes", "June 2018"));
        audioBooks.add(new AudioBook("Watchers", "Edoardo Ballerini", "15 hours 22 minutes", "May 2018"));
        audioBooks.add(new AudioBook("The Director", "George Guidall", "13 hours 34 minutes", "June 2014"));
        audioBooks.add(new AudioBook("A Steep Price", "Emily Sutton-Smith", "10 hours 10 minutes", "June 2018"));
        audioBooks.add(new AudioBook("I Am Watching You", "Elizabeth Knowelden", "8 hours 24 minutes", "October 2017"));
        audioBooks.add(new AudioBook("Killman Creek", "Dan John Miller, Emily Sutton-Smith, Lauren Ezzo, Will Ropp", "11 hours 56 minutes", "December 2017"));
        audioBooks.add(new AudioBook("An Unwanted Guest", "Hillary Huber", "8 hours 27 minutes", "July 2018"));

    }

    // Get the audiobooks
    public ArrayList<AudioBook> getAudioBooks() {
        addAudiobooks();
        return audioBooks;
    }
}
