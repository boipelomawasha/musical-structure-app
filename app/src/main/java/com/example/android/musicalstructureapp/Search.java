package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Search extends AppCompatActivity implements SearchView.OnQueryTextListener {

    //Create instances of the genres
    private Comedy comedy = new Comedy();
    private Drama drama = new Drama();
    private Horror horror = new Horror();
    private Thriller thriller = new Thriller();

    //Create aggregated list
    private ArrayList<AudioBook> allAudioBooks = new ArrayList<>();

    //Create search list
    private ArrayList<AudioBook> searchList = new ArrayList<>();

    // Create adapter
    AudioBookAdapter myAdapter;

    //Create ListView
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_view);

        // Get audiobooks
        ArrayList<AudioBook> comedyAudioBooks = comedy.getAudioBooks();
        ArrayList<AudioBook> dramaAudioBooks = drama.getAudioBooks();
        ArrayList<AudioBook> horrorAudioBooks = horror.getAudioBooks();
        ArrayList<AudioBook> thrillerAudioBooks = thriller.getAudioBooks();

        // Add all audiobooks to combined list
        allAudioBooks.addAll(comedyAudioBooks);
        allAudioBooks.addAll(dramaAudioBooks);
        allAudioBooks.addAll(horrorAudioBooks);
        allAudioBooks.addAll(thrillerAudioBooks);

        // Create instance AudioBook adapter with the ArrayList and context
        updateAdapter(allAudioBooks);

        // Locate the ListView to use
        listView = findViewById(R.id.abFullList);

        // Make use of the adapter in your ListView instance
        useAdapter();

        // Set a listener on search view
        SearchView audiobookSearch = findViewById(R.id.search);
        audiobookSearch.setOnQueryTextListener(this);

    }

    // Update adapter with audiobook list
    private void updateAdapter(List<AudioBook> audioBooks) {
        myAdapter = new AudioBookAdapter(this, audioBooks);
    }

    private void useAdapter() {
        listView.setAdapter(myAdapter);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        filter(text);
        return false;
    }

    // Method for filtering results
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        searchList.clear();
        if (charText.length() == 0) {
            searchList.addAll(allAudioBooks);
        } else {

            for (AudioBook ab : allAudioBooks)
                if (ab.getTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                    searchList.add(ab);
                }
        }
        updateAdapter(searchList);
        useAdapter();
    }
}
