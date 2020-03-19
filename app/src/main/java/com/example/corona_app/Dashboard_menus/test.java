package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.corona_app.R;

public class test extends AppCompatActivity implements View.OnClickListener{

   public int point=0,count=0;
   private Button submit;
   private TextView report,clear_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        submit=(Button)findViewById(R.id.submit_id);submit.setOnClickListener(this);
        report=(TextView)findViewById(R.id.report_text_id);
        clear_text=(TextView)findViewById(R.id.clear_id);clear_text.setOnClickListener(this);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {

            //Functions for No checked;;;;;;
            case R.id.one:
                if (checked){count=count+0;}
                // Put some meat on the sandwich
                else{count=count+0;}
                // Remove the meat
                break;
            case R.id.two:
                if (checked){count=count+0;}
                // Put some meat on the sandwich
                else{count=count+0;}
                // Remove the meat
                break;
            case R.id.six:
                if (checked){count=count+0;}
                // Put some meat on the sandwich
                else{count=count+0;}
                // Remove the meat
                break;
            case R.id.Eight:
                if (checked){count=count+0;}
                // Put some meat on the sandwich
                else{count=count+0;}
                // Remove the meat
                break;
            case R.id.Ten:
                if (checked){count=count+0;}
                // Put some meat on the sandwich
                else{count=count+0;}
                // Remove the meat
                break;
            case R.id.twelve:
                if (checked){count=count+0;}
                // Put some meat on the sandwich
                else{count=count+0;}
                // Remove the meat
                break;
            case R.id.seventeen:
                if (checked){count=count+0;}
                // Put some meat on the sandwich
                else{count=count+0;}
                // Remove the meat
                break;





            case R.id.three:
                if (checked){count=count+1;}
                // Put some meat on the sandwich
            else{count=count+0;}
                // Remove the meat
                break;
            case R.id.Four:
                if (checked){count=count+1;}
                // Cheese me
            else{count=count+0;}
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich

            case R.id.Five:
                if (checked){count=count+1;}
                // Put some meat on the sandwich
                else{count=count+0;}
                    // Remove the meat
                    break;
            case R.id.seven:
                if (checked){count=count+1;}
                // Cheese me
                else{count=count+0;}
                    // I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich

            case R.id.Nine:
                if (checked){count=count+1;}
                // Put some meat on the sandwich
                else{count=count+0;}
                    // Remove the meat
                    break;
            case R.id.eleven:
                if (checked){count=count+1;}
                // Cheese me
                else{count=count+0;}
                    // I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich

            case R.id.thirteen:
                if (checked){count=count+1;}
                // Put some meat on the sandwich
                else{count=count+0;}
                    // Remove the meat
                    break;
            case R.id.forteen:
                if (checked){count=count+1;}
                // Cheese me
                else{count=count+0;}
                    // I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich
            case R.id.fifteen:
                if (checked){count=count+1;}
                // Cheese me
                else{count=count+0;}
                    // I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich
            case R.id.sixteen:
                if (checked){count=count+1;}
                // Cheese me
                else{count=count+0;}
                    // I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich
        }

    }



    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.submit_id:
                report.setText(""+count);
                if(point>0){
                    Toast.makeText(getApplicationContext(),"Please Clear the Report And also Uncheck your option",Toast.LENGTH_LONG).show();
                }
                if(count>5){
                report.setText("You are in Danger...");
                report.setTextColor(R.color.red);
            }
                if(count<=5){
                    report.setText("Don't Panic,You are in safe...");

                }
                point=point+1;
                break;
            case R.id.clear_id:
                report.setText("");
                count=0;point=0;
                break;
        }
    }
}
