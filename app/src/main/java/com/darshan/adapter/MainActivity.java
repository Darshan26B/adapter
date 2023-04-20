package com.darshan.adapter;

import static com.darshan.adapter.R.drawable.car1;
import static com.darshan.adapter.R.drawable.car2;
import static com.darshan.adapter.R.drawable.car3;
import static com.darshan.adapter.R.drawable.car4;
import static com.darshan.adapter.R.drawable.car5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    int image[]={car1,car2,car3,car4,car5};

    ListView lise_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lise_view=findViewById(R.id.list_view);
        NameAdapter adapter=new NameAdapter(image);
        lise_view.setAdapter(adapter);

    }
}