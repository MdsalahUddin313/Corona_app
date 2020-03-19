package com.example.corona_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.corona_app.Dashboard_menus.History_Of_Corona;
import com.example.corona_app.Dashboard_menus.food;
import com.example.corona_app.Dashboard_menus.protectyourself;
import com.example.corona_app.Dashboard_menus.shopping;
import com.example.corona_app.Dashboard_menus.situation_update;
import com.example.corona_app.Dashboard_menus.test;
import com.example.corona_app.Dashboard_menus.tools;
import com.example.corona_app.Dashboard_menus.travel_activity;

public class second2 extends AppCompatActivity implements View.OnClickListener {

    private Button food_btn, shopping_btn, transport_btn, history, protect, travel, test_btn, situation_update_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
/*
   protect = (Button) findViewById(R.id.Protect_yourself_id);
        protect.setOnClickListener(this);
        travel = (Button) findViewById(R.id.Travel_advice_id);
        travel.setOnClickListener(this);
        history = (Button) findViewById(R.id.History_of_corona_id);
        history.setOnClickListener(this);

        food_btn = (Button) findViewById(R.id.food_id);
        food_btn.setOnClickListener(this);
        shopping_btn = (Button) findViewById(R.id.shopping_id);
        shopping_btn.setOnClickListener(this);
        transport_btn = (Button) findViewById(R.id.transport_id);
        transport_btn.setOnClickListener(this);
        test_btn = (Button) findViewById(R.id.Test_yourself_id);
        test_btn.setOnClickListener(this);
        situation_update_btn = (Button) findViewById(R.id.Situation_updates_id);
        situation_update_btn.setOnClickListener(this);
 */

    }
/*
 @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Protect_yourself_id:
                Intent i = new Intent(second2.this, protectyourself.class);
                startActivity(i);
                break;
            case R.id.Travel_advice_id:
                Intent i2 = new Intent(second2.this, travel_activity.class);
                startActivity(i2);
                break;
            case R.id.History_of_corona_id:
                Intent i3 = new Intent(second2.this, History_Of_Corona.class);
                startActivity(i3);
                break;

            case R.id.food_id:
                Intent i4 = new Intent(second2.this, food.class);
                startActivity(i4);
                break;
            case R.id.shopping_id:
                Intent i5 = new Intent(second2.this, shopping.class);
                startActivity(i5);
                break;
            case R.id.transport_id:
                Intent i6 = new Intent(second2.this, tools.class);
                startActivity(i6);
                break;
            case R.id.Test_yourself_id:
                Intent i7 = new Intent(second2.this, test.class);
                startActivity(i7);
                break;
            case R.id.Situation_updates_id:
                Intent i8 = new Intent(second2.this, situation_update.class);
                startActivity(i8);
                break;
        }
    }
 */
@Override
public void onClick(View v) {
    switch (v.getId()) {}}

}
