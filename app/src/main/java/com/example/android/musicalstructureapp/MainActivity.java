package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the comedy genre
        ImageView comedy = (ImageView) findViewById(R.id.comedy);

        // Set a click listener on that View
        comedy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Comedy Activity
                Intent comedyIntent = new Intent(MainActivity.this, Comedy.class);

                // Start the new activity
                startActivity(comedyIntent);
            }
        });

        // Find the View that shows the horror genre
        ImageView horror = (ImageView) findViewById(R.id.horror);

        // Set a click listener on that View
        horror.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Horror Activity
                Intent horrorIntent = new Intent(MainActivity.this, Horror.class);

                // Start the new activity
                startActivity(horrorIntent);
            }
        });

        // Find the View that shows the thriller
        ImageView thriller = (ImageView) findViewById(R.id.thriller);

        // Set a click listener on that View
        thriller.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Thriller Activity
                Intent thrillerIntent = new Intent(MainActivity.this, Thriller.class);

                // Start the new activity
                startActivity(thrillerIntent);
            }
        });

        // Find the View that shows the drama
        ImageView drama = (ImageView) findViewById(R.id.drama);

        // Set a click listener on that View
        drama.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Drama
                Intent dramaIntent = new Intent(MainActivity.this, Drama.class);

                // Start the new activity
                startActivity(dramaIntent);
            }
        });
    }
}
