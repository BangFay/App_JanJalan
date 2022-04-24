package com.example.janjalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class About extends AppCompatActivity {
        Button btkembali;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_about);

            btkembali = (Button) findViewById(R.id.btkembali);

            btkembali.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(About.this, MenuUtama.class);
                    finish();
                    startActivity(intent);
                }
            });
        }
}