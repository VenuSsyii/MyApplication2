package com.example.taruc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global area
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R = resources class
        //Display this UI
        setContentView(R.layout.activity_main);
    }

    //View class - refers to any UI component
    public void displayName(View v){
        TextView textViewName;
        EditText editTextName;
        EditText editTextAge;

        textViewName = (TextView)findViewById(R.id.hello);
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);

        int age = Integer.parseInt(editTextAge.getText().toString());
        textViewName.setText(getString(R.string.greeting)+" "+editTextName.getText()+", you will be "+ (age+1) +" in 2018");
    }
}
