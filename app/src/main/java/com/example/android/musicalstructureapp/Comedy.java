package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Comedy extends AppCompatActivity {

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

        // Make use of the adapter in your ListView instance
        listView.setAdapter(myAdapter);

    }

    private void addAudiobooks() {

        audioBooks.add(new AudioBook("The Last Black Unicorn", "Tiffany Haddish", "6 hours 3 minutes", "December 2017"));
        audioBooks.add(new AudioBook("How Not to Get Shot: And Other Advice From White People", "D. L. Hughley", "3 hours 42 minutes", "June 2018"));
        audioBooks.add(new AudioBook("Scrappy Little Nobody", "Anna Kendrick", "6 hours 1 minute", "November 2016"));
        audioBooks.add(new AudioBook("I Hate Myselfie", "Shane Dawson", "4 hours 8 minutes", "March 2015"));
        audioBooks.add(new AudioBook("Dad Is Fat", "Jim Gaffigan", "5 hours 27 minutes", "May 2013"));
        audioBooks.add(new AudioBook("Seriously Funny", "Kevin Hart", "1 hour", "July 2010"));
        audioBooks.add(new AudioBook("My Fake Problems", "David Spade", "1 hour 4 minutes", "May 2014"));
        audioBooks.add(new AudioBook("Lies Chelsea Handler Told Me", "Various Readers", "6 hours 46 minutes", "May 2011"));

    }

    // Get the audiobooks
    public ArrayList<AudioBook> getAudioBooks() {
        addAudiobooks();
        return audioBooks;
    }

}
