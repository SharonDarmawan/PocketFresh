package com.example.pocketfresh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class vegetablesInSeason extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetables_in_season);


        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button item1 = findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("clicked item desc!");
                Intent myIntent = new Intent(view.getContext(), ItemScreen.class);
                startActivity(myIntent);
            }
        });

        Button item2 = findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("clicked item desc!");
                Intent myIntent = new Intent(view.getContext(), ItemScreen.class);
                startActivity(myIntent);
            }
        });

        Button item3 = findViewById(R.id.item3);
        item3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("clicked item desc!");
                Intent myIntent = new Intent(view.getContext(), ItemScreen.class);
                startActivity(myIntent);
            }
        });

        Button item4 = findViewById(R.id.item4);
        item4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("clicked item desc!");
                Intent myIntent = new Intent(view.getContext(), ItemScreen.class);
                startActivity(myIntent);
            }
        });

        Button item5 = findViewById(R.id.item5);
        item5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("clicked item desc!");
                Intent myIntent = new Intent(view.getContext(), ItemScreen.class);
                startActivity(myIntent);
            }
        });

        Button item6 = findViewById(R.id.item6);
        item6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("clicked item desc!");
                Intent myIntent = new Intent(view.getContext(), ItemScreen.class);
                startActivity(myIntent);
            }
        });


    }


}