package com.musayilmaz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void changeImage(View View) {

            ImageView ImageView = (ImageView) findViewById(R. id.imageView );
            Button button = findViewById(R. id.button);
            button.setText("Change");

            ImageView.setImageResource(R. drawable.metallica2);
        }
    }

