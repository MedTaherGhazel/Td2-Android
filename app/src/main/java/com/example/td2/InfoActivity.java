package com.example.td2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textName, textRace, textOrigin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imageView = findViewById(R.id.imageView);
        textName = findViewById(R.id.textName);
        textRace = findViewById(R.id.textRace);
        textOrigin = findViewById(R.id.textOrigin);

        Intent intent = getIntent();
        if (intent != null) {
            String imageName = intent.getStringExtra("imageName");
            String name = intent.getStringExtra("name");
            String race = intent.getStringExtra("race");
            String origin = intent.getStringExtra("origin");

            if (imageName != null) {
                int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                imageView.setImageResource(imageResourceId);
            }
            if (name != null) {
                textName.setText(name);
            }
            if (race != null) {
                textRace.setText(race);
            }
            if (origin != null) {
                textOrigin.setText(origin);
            }
        }
    }
}
