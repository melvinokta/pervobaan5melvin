package com.percobaan5.percobaan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activityHero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
        int photoResource = getIntent().getIntExtra("HERO_PHOTO", 0);
        String name = getIntent().getStringExtra("HERO_NAME");
        String description = getIntent().getStringExtra("HERO_DESCRIPTION");
        ImageView imageView = findViewById(R.id.img_item_photo);
        TextView nameTextView = findViewById(R.id.tv_item_name);
        TextView descriptionTextView = findViewById(R.id.tv_item_description);
        imageView.setImageResource(photoResource);
        nameTextView.setText(name);
        descriptionTextView.setText(description);
    }

}