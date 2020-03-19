package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.corona_app.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class situation_update extends AppCompatActivity {

    EditText editText;
    Button submit;
    DatabaseReference rootRef,demoRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation_update);


       // editText = (EditText) findViewById(R.id.inputvalue_id);
       // submit = (Button) findViewById(R.id.submit_id);
//database reference pointing to root of database
        rootRef = FirebaseDatabase.getInstance().getReference();

        //submit into database

    }
    }

