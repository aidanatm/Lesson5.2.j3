package com.example.lesson52j3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView;
        MainAdapter adapter;

            recyclerView = findViewById(R.id.rv);
            adapter = new MainAdapter();
            recyclerView.setAdapter(adapter);

            RecyclerView.LayoutManager manager =
                    new LinearLayoutManager(this,
                            LinearLayoutManager.HORIZONTAL,
                            false);

            recyclerView.setLayoutManager(manager);
            ArrayList<ItemModel> list = new ArrayList<>();
            list.add(0, new ItemModel(R.drawable.oxfords, "", "170+ items"));
            list.add(1, new ItemModel(R.drawable.leatherjacket,"", "170+ items" ));
            list.add(2, new ItemModel(R.drawable.jacket, "", "170+ items"));
            list.add(3, new ItemModel(R.drawable.outerwear, "", "170+ items"));
            list.add(4, new ItemModel(R.drawable.coach,"", " 170+ items"));
            list.add(5, new ItemModel(R.drawable.sweater,"", "170+ items"));
            list.add(6, new ItemModel(R.drawable.hoodi,"", "170+ items"));

            adapter.addText(list);
    }
}