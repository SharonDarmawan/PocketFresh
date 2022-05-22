package com.example.pocketfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class ItemScreen extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private boolean isLiked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_screen);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        ImageButton backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("clicked backbutton!");
                onBackPressed();
            }
        });

        ImageButton likeButton = findViewById(R.id.like);
        likeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (!isLiked) {
                    System.out.println("clicked liked button!");
                    likeButton.setImageResource(R.drawable.likeheart);

                    Context context = getApplicationContext();
                    CharSequence text = "Added item to likes!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    isLiked = true;

                } else {
                    System.out.println("clicked unlike button");
                    Context context = getApplicationContext();
                    CharSequence text = "Removed item from likes!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    likeButton.setImageResource(R.drawable.like);
                    isLiked = false;

                }
            }
        });


            PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        pagerAdapter.addFragment(new description(), "Description");
        pagerAdapter.addFragment(new how_to_select(), "How to Select");
        pagerAdapter.addFragment(new recipes(), "Recipes");



        viewPager.setAdapter(pagerAdapter);

    }

}


