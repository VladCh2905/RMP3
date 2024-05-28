package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ll);
    }
    public void onClick(View view) {
        // создание объекта Intent для запуска SecondActivity
        Intent intent = new Intent(this, SecondActivity.class);
        // передача объекта с ключом "hello" и значением "Hello World"
        intent.putExtra("hello", "Hello World");
        // запуск SecondActivity
        startActivity(intent);
    }

}