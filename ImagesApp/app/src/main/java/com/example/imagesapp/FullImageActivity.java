package com.example.imagesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        ImageView imageView = findViewById(R.id.myZoomageView);
        Glide.with(this).load(getIntent().getStringExtra("image"))
                .into(imageView);
    }
}