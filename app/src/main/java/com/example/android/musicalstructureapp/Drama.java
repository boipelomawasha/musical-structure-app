package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Drama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audiobook_list_view);

        // Create a list of audiobooks
        ArrayList<AudioBook> audioBooks = new ArrayList<>();

        //Add audiobooks
        audioBooks.add(new AudioBook("The Crucible", "Stacy Keach, Richard Dreyfuss", "1 hour 59 minutes", "August 2006"));
        audioBooks.add(new AudioBook("Pride and Predjudice", "Jane Carr, Julia McIlvane, Nick Toren", "1 hour 50 minutes", "April 2013"));
        audioBooks.add(new AudioBook("A Streetcar Named Desire", "Theater Lincoln Center", "2 hours 15 minutes", "January 2009"));
        audioBooks.add(new AudioBook("Pygmalion", "Various Narrators", "2 hours 38 minutes", "July 2002"));
        audioBooks.add(new AudioBook("Another Woman's Man", "Lynette R. Freeman", "10 hours 12 minutes", "August 2017"));
        audioBooks.add(new AudioBook("The Road to Mecca", "Harris Yulin, Amy Irving, Julie Harris", "2 hours 9 minutes", "February 2015"));
        audioBooks.add(new AudioBook("Waiting for Godot", "Various Narrators", "2 hours 4 minutes", "March 2006"));
        audioBooks.add(new AudioBook("The Heidi Chronicles", "Various Performers", "2 hours 9 minutes", "January 2004"));

        // Create instance AudioBook adapter with the ArrayList and context
        AudioBookAdapter myAdapter = new AudioBookAdapter(this, audioBooks);

        // Locate the ListView to use
        ListView listView = findViewById(R.id.abList);

        // MAke use of the adapter in your ListView instance
        listView.setAdapter(myAdapter);

    }
}
