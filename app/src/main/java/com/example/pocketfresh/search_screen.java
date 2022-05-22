package com.example.pocketfresh;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class search_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LinearLayout searchResults = findViewById(R.id.search_results);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (editText.getText().toString().isEmpty()) {
                    searchResults.setVisibility(View.INVISIBLE);
                } else {
                    searchResults.setVisibility(View.VISIBLE);
                }
                System.out.println("Changed the edit text!");
            }

            @Override
            public void afterTextChanged(Editable editable) {
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


    }
}