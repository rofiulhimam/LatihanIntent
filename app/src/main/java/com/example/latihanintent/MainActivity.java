package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button layoutpertama;
    Button layoutkedua;
    Button layoutketiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutpertama = (Button) findViewById(R.id.btn_layoutpertama);
        layoutpertama.setOnClickListener(this);
        layoutkedua = (Button)findViewById(R.id.btn_layoutkedua);
        layoutkedua.setOnClickListener(this);
        layoutketiga = (Button)findViewById(R.id.btn_layoutketiga);
        layoutketiga.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_layoutpertama:
                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent1);
                break;
            case R.id.btn_layoutkedua:
                Intent intent2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent2);
                break;
            case R.id.btn_layoutketiga:
                Intent intent3 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent3);
                break;
        }
    }
}