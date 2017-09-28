package com.example.annemarie.bikeworlddublin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        TextView textview = new TextView(this);
        textview.setText("This is the gallery tab");
        setContentView(textview);
    }
}
