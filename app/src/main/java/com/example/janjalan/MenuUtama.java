package com.example.janjalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {
    Button button1, btabout, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        button1 = findViewById(R.id.button1);
        btabout = findViewById(R.id.btabout);
        button5 = findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, WisataAlam.class);
                finish();
                startActivity(intent);
            }
        });

        btabout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MenuUtama.this, About.class);
                finish();
                startActivity(intent1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //membuat method tombol keluar dari aplikasi

            }
        });
    }
}