package com.example.electriccalculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

import com.example.electriccalculator.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button githubButton = findViewById(R.id.github);
        Button youtubeButton = findViewById(R.id.youtube);
        ImageButton imageButton = findViewById(R.id.imageButton);

        githubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://github.com/alianrysmn");
            }
        });

        youtubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.youtube.com/channel/UC9S3vTZW8Ha1OJDmkpDHJ6w");
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
