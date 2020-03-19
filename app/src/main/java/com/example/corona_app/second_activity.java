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

public class second_activity extends AppCompatActivity implements View.OnClickListener {

    private Button food_btn, shopping_btn,prayer, transport_btn, history, protect, travel, test_btn, situation_update_btn,tools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        initialize();
    }

    private void initialize() {

        test_btn=(Button)findViewById(R.id.Test_id);test_btn.setOnClickListener(this);
       protect=(Button)findViewById(R.id.Protection_id);protect.setOnClickListener(this);
       situation_update_btn=(Button)findViewById(R.id.situation_data_id);situation_update_btn.setOnClickListener(this);

       travel=(Button)findViewById(R.id.Travel_id);travel.setOnClickListener(this);
        history=(Button)findViewById(R.id.History_id);history.setOnClickListener(this);
       shopping_btn=(Button)findViewById(R.id.Shopping_id);shopping_btn.setOnClickListener(this);

       tools=(Button)findViewById(R.id.Tools_id);tools.setOnClickListener(this);
        food_btn=(Button)findViewById(R.id.Food_id);food_btn.setOnClickListener(this);
        prayer=(Button)findViewById(R.id.Prayer_id);prayer.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Test_id:
                Intent i=new Intent(second_activity.this,test.class);startActivity(i);
                break;
            case R.id.Protection_id:
                Intent i2=new Intent(second_activity.this,protectyourself.class);startActivity(i2);
                break;
            case R.id.situation_data_id:
                Intent i3=new Intent(second_activity.this,situation_update.class);startActivity(i3);
                break;
            case R.id.History_id:
                Intent i4=new Intent(second_activity.this,History_Of_Corona.class);startActivity(i4);
                break;
            case R.id.Travel_id:
                Intent i5=new Intent(second_activity.this,travel_activity.class);startActivity(i5);
                break;
            case R.id.Shopping_id:
                Intent i6=new Intent(second_activity.this,shopping.class);startActivity(i6);
                break;

            case R.id.Tools_id:
                Intent i7=new Intent(second_activity.this,tools.class);startActivity(i7);
                break;
            case R.id.Food_id:
                Intent i8=new Intent(second_activity.this,travel_activity.class);startActivity(i8);
                break;
            case R.id.Prayer_id:
                Intent i9=new Intent();startActivity(i9);
                break;


        }
    }
}
