package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Button but0;
    private Button butDecPoint;
    private TextView outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){

        outputText=findViewById(R.id.outputText);
//        but1=findViewById(R.id.but1);
//        but1.setOnClickListener(universalListener);
//
//        but2=findViewById(R.id.but2);
//        but2.setOnClickListener(universalListener);
//
//        but3=findViewById(R.id.but3);
//        but3.setOnClickListener(universalListener);
//
//        but4=findViewById(R.id.but4);
//        but4.setOnClickListener(universalListener);
//
//        but5=findViewById(R.id.but5);
//        but5.setOnClickListener(universalListener);
//
//        but6=findViewById(R.id.but6);
//        but6.setOnClickListener(universalListener);
//
//        but7=findViewById(R.id.but7);
//        but7.setOnClickListener(universalListener);
//
//        but8=findViewById(R.id.but8);
//        but8.setOnClickListener(universalListener);
//
//        but9=findViewById(R.id.but9);
//        but9.setOnClickListener(universalListener);
//
//        but0=findViewById(R.id.but0);
//        but0.setOnClickListener(universalListener);
//
//        butDecPoint=findViewById(R.id.but0);
//        butDecPoint.setOnClickListener(universalListener);


    }
    public void btnPress(View view) {
        Button btn = (Button) view;
        outputText.append(btn.getText());
    }


}
