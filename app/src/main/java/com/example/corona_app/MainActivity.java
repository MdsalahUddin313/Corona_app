package com.example.corona_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.corona_app.Dashboard_menus.food;
import com.example.corona_app.Dashboard_menus.situation_update;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.imageLogo);

        Animation anime= AnimationUtils.loadAnimation(this,R.anim.splash);

        iv.startAnimation(anime);

        final Intent intent=new Intent(MainActivity.this, second_activity.class);

        Thread timer=new Thread(){
            public void run(){
                try{

                    sleep(5000);
                }catch (InterruptedException e){

                    e.printStackTrace();
                }

                finally {
                    startActivity(intent);
                    finish();
                }
            }

        };
        timer.start();
    }
}
