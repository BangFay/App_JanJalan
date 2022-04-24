package com.example.janjalan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button10 = (Button)findViewById(R.id.button10);

        button10.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),MenuUtama.class);
            startActivity(intent1);
        });
    }
}