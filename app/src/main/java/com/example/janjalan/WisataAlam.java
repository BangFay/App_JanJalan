package com.example.janjalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class WisataAlam extends AppCompatActivity {
    Button btkembali;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        btkembali = (Button) findViewById(R.id.btkembali);

        btkembali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WisataAlam.this, MenuUtama.class);
                finish();
                startActivity(intent);
            }
        });

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"--> Pantai Pasir Tinggi"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Pantai.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}