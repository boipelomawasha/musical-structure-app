package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Thriller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audiobook_list_view);

        // Create a list of audiobooks
        ArrayList<AudioBook> audioBooks = new ArrayList<>();

        //Add audiobooks
        audioBooks.add(new AudioBook("Deception Point", "Boyd Gaines", "6 hours 18 minutes", "November 2003"));
        audioBooks.add(new AudioBook("Behind Closed Doors: A Novel", "Georgia Maguire", "8 hours 24 minutes", "August 2016"));
        audioBooks.add(new AudioBook("Her Pretty Face", "Kirby Heyborne, Cassandra Campbell, Rebekkah Ross", "8 hours 33 minutes", "July 2018"));
        audioBooks.add(new AudioBook("The Whispering Room", "Elisabeth Rodgers", "16 hours 46 minutes", "November 2017"));
        audioBooks.add(new AudioBook("Leverage in Death", "Susan Ericksen", "13 hours 46 minutes", "September 2018"));
        audioBooks.add(new AudioBook("Deception Point", "Boyd Gaines", "6 hours 18 minutes", "November 2003"));
        audioBooks.add(new AudioBook("Tear Me Apart", "Caitlin Davies, Rebekkah Ross, Eva Kaminsky, Pete Simonelli, Jacques Roy, Amy Mcfadden", "13 hours 11 minutes", "August 2018"));
        audioBooks.add(new AudioBook("In Cold Blood", "Scott Brick", "14 hours 30 minutes", "January 2006"));

        // Create instance AudioBook adapter with the ArrayList and context
        AudioBookAdapter myAdapter = new AudioBookAdapter(this, audioBooks);

        // Locate the ListView to use
        ListView listView = findViewById(R.id.abList);

        // MAke use of the adapter in your ListView instance
        listView.setAdapter(myAdapter);

    }
}
