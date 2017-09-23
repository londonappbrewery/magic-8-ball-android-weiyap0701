package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.id.selectButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEverything();
    }

    void setupEverything()
    {
        Button myButton = (Button) findViewById(R.id.selectButton);
        final ImageView selectionImageView = (ImageView) findViewById(R.id.selectionImageView);
        final int[] myArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ranNumberGenerator = new Random();
                final int ranNumber = ranNumberGenerator.nextInt(5);
                selectionImageView.setImageResource(myArray[ranNumber]);
                Log.d("Button click","fgfgf");
            }
        });
    }
}
