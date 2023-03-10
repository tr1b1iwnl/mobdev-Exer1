package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnExercise1, btnActivity1, btnActivity2, btnActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExercise1 = (Button) findViewById(R.id.btnExercise1);
        btnActivity1 = (Button) findViewById(R.id.btnActivity1);
        btnActivity2 = (Button) findViewById(R.id.btnActivity2);
        btnActivity3 = (Button) findViewById(R.id.btnActivity3);

        btnExercise1.setOnClickListener(this);
        btnActivity1.setOnClickListener(this);
        btnActivity2.setOnClickListener(this);
        btnActivity3.setOnClickListener(this);

//        btnActivity1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Activity 1 is clicked!",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnExercise1:
                Toast.makeText(MainActivity.this, "Exercise 1 is clicked!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnActivity1:
                Toast.makeText(MainActivity.this, "Activity 1 is clicked!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MyActivity_1_Circle.class);
                startActivity(intent);
                break;
            case R.id.btnActivity2:
                Toast.makeText(MainActivity.this, "Activity 2 is clicked!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnActivity3:
                Toast.makeText(MainActivity.this, "Activity 3 is clicked!",Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}