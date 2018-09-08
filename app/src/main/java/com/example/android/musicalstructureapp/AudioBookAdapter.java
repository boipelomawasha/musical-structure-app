package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AudioBookAdapter extends ArrayAdapter<AudioBook> {

    /**
     * @param context    current context
     * @param audioBooks the list of audiobook details to be displayed
     */

    public AudioBookAdapter(@NonNull Context context, @NonNull List<AudioBook> audioBooks) {
        super(context, 0, audioBooks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View audiobookList = convertView;
        if (audiobookList == null) {
            audiobookList = LayoutInflater.from(getContext()).inflate(
                    R.layout.audio_book_list, parent, false);
        }

        AudioBook currentBook = getItem(position);

        // Find the TextView in the audio_book_list.xml layout with the ID title.
        TextView titleTextView = (TextView) audiobookList.findViewById(R.id.title);
        titleTextView.setText(currentBook.getTitle());

        // Find the TextView in the audio_book_list.xml layout with the ID narrated_by.
        TextView narratedByTextView = (TextView) audiobookList.findViewById(R.id.narrated_by);
        narratedByTextView.setText(currentBook.getNarratedBy());

        // Find the TextView in the audio_book_list.xml layout with the ID length.
        TextView lengthTextView = (TextView) audiobookList.findViewById(R.id.length);
        lengthTextView.setText(currentBook.getLength());

        // Find the TextView in the audio_book_list.xml layout with the ID release_date.
        TextView releaseDateTextView = (TextView) audiobookList.findViewById(R.id.release_date);
        releaseDateTextView.setText(currentBook.getReleaseDate());

        // Return the whole list item layout (containing 4 TextViews)
        return audiobookList;
    }
}