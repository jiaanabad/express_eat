package com.example.express_eat;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class McdonaldsMenu extends AppCompatActivity implements View.OnClickListener {

    Button burgers, fries, drinks, rice_meals, desserts;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items);

        layout = findViewById(R.id.layout_food);
        burgers = findViewById(R.id.btn_food_one);
        fries = findViewById(R.id.btn_food_two);
        drinks = findViewById(R.id.btn_food_three);
        rice_meals = findViewById(R.id.btn_food_four);
        desserts = findViewById(R.id.btn_food_five);

        layout.setBackgroundResource(R.drawable.mcdo_food_bg);

        burgers.setOnClickListener(this);
        fries.setOnClickListener(this);
        drinks.setOnClickListener(this);
        rice_meals.setOnClickListener(this);
        desserts.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Mcdo_Food.class);
        switch (v.getId()) {
            case R.id.btn_food_one:
                intent.putExtra("CATEGORY", "burger");
                break;
            case R.id.btn_food_two:
                intent.putExtra("CATEGORY", "fries");
                break;
            case R.id.btn_food_three:
                intent.putExtra("CATEGORY", "drinks");
                break;
            case R.id.btn_food_four:
                intent.putExtra("CATEGORY", "rice_meals");
                break;
            case R.id.btn_food_five:
                intent.putExtra("CATEGORY", "desserts");
                break;
        }
        startActivity(intent);
    }
}