package com.example.mosalah.newproject.activite;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.mosalah.newproject.database.mydatabase;
import com.example.mosalah.newproject.model.model;
import com.example.mosalah.newproject.R;
import com.example.mosalah.newproject.model.user;
import com.example.mosalah.newproject.recycler;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity_recycler extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<model> models = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_recycler);

        recyclerView = findViewById(R.id.Ma2_recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        MainActivity.my = Room.databaseBuilder(getApplicationContext(), mydatabase.class, "users").allowMainThreadQueries().build();
        try {
            //show list of user in recyclerview
            List<user> list = MainActivity.my.information().getusers();

            for (user li : list) {
                model model = new model(String.valueOf(li.getId()), String.valueOf(li.getAge()),
                        li.getName(), li.getName(), li.getPass());
                models.add(model);
            }
            adapter = new recycler(models);
            recyclerView.setAdapter(adapter);
        } catch (Exception e) {
            //message from exception
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
