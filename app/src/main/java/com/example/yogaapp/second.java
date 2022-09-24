package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1=findViewById(R.id.startyoga1);
        button2=findViewById(R.id.startyoga2);

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent=new Intent(second.this,secondActivity2.class);
               startActivity(intent);


           }
       });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(second.this,secondActivity3.class);
                startActivity(intent);


            }
        });






    }





    public void Food(View view) {
        Intent intent= new Intent(second.this,FoodActivity.class);
        startActivity(intent);

    }


    public void beforeage18(View view) {

        Intent intent= new Intent(second.this,secondActivity2.class);
        startActivity(intent);
    }

    public void Afterage18(View view) {
        Intent intent= new Intent(second.this,secondActivity3.class);
        startActivity(intent);
    }
}