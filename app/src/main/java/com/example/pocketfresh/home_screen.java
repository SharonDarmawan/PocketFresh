package com.example.pocketfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView searchbar = findViewById(R.id.imageView2);
        searchbar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("Clicked searchbar!");
                Intent myIntent = new Intent(view.getContext(), search_screen.class);
                startActivity(myIntent);
            }
        });

        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("Clicked searchbar!");
                Intent myIntent = new Intent(view.getContext(), search_screen.class);
                startActivity(myIntent);
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                System.out.println("Clicked searchbar!");
                Intent myIntent = new Intent(view.getContext(), search_screen.class);
                startActivity(myIntent);
            }
        });

        ImageView vegetables = findViewById(R.id.imageView3);
        vegetables.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("Clicked vegetables in season!");
                Intent myIntent = new Intent(view.getContext(), vegetablesInSeason.class);
                startActivity(myIntent);
            }
        });

        ImageView fruits = findViewById(R.id.imageView4);
        fruits.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("Clicked fruits in season!");
                Intent myIntent = new Intent(view.getContext(), fruitsInSeason.class);
                startActivity(myIntent);
            }
        });
    }
}