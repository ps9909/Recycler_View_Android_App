package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyListData[] myListData = new MyListData[]{
                new MyListData("Abigail", R.drawable.image1),
                new MyListData("Bianca", R.drawable.image2),
                new MyListData("Catherine", R.drawable.image3),
                new MyListData("Daniel", R.drawable.image4),
                new MyListData("Emily", R.drawable.image5),
                new MyListData("Farah", R.drawable.image6),
                new MyListData("Gabriel", R.drawable.image7),
                new MyListData("Horatio", R.drawable.image8),

        };
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(myListData);
        recyclerView.setAdapter(adapter);
    }
}
