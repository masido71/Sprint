package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataAlam extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Air Terjun Efrata", "Bukit Sibea-bea",
                "Menara Pandang Tele", "Desa Tomok","Pantai Parbaba"


        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), AirTerjun.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), BukitSibea.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Danau.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), HutanRaya.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Pantai.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), Danau.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}