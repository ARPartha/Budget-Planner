package com.example.budgetplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class Category extends AppCompatActivity {
    private GridLayout gridLayout;
    Button addItems;
    DynamicViews dynamicViews;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        gridLayout = (GridLayout)findViewById(R.id.gridLayout);
        addItems = (Button)findViewById(R.id.category);

        addItems.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dynamicViews = new DynamicViews(context);
                gridLayout.addView(dynamicViews.descriptionTextView(getApplicationContext(),"Item 1"),2);
                gridLayout.addView(dynamicViews.recievedQuantityEditText(getApplicationContext()),3);
            }
        });
    }
}
