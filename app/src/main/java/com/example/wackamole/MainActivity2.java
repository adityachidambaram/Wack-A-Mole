package com.example.wackamole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView score1;
    Button play, home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String score = bundle.getString("ABC");

        System.out.println(score + "jasj");

        score1.findViewById(R.id.scoreText);
        //System.out.println("2");


        //score1.setText("Score: " + score);
        System.out.println("5");




    }
}