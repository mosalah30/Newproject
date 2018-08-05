package com.example.mosalah.newproject.activite;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.mosalah.newproject.R;
import com.example.mosalah.newproject.database.mydatabase;
import com.example.mosalah.newproject.model.user;


public class MainActivity extends AppCompatActivity {
    EditText name, age, objective, pass, id;
    String n, o, p;
    FloatingActionButton go;
    public static mydatabase my;
    user u = new user();


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        id = findViewById(R.id.editText_);
        objective = findViewById(R.id.object);
        pass = findViewById(R.id.pass);
        go = findViewById(R.id.floatingActionButton1);
        my = Room.databaseBuilder(getApplicationContext(), mydatabase.class, "users").allowMainThreadQueries().build();
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }


    public void here(View view) {
        try {
            n = name.getText().toString();
            int a = Integer.parseInt(age.getText().toString());
            o = objective.getText().toString();
            p = pass.getText().toString();
            int i = Integer.parseInt(id.getText().toString());

            u.setId(i);
            u.setAge(a);
            u.setJob(o);
            u.setName(n);
            u.setPass(p);
            MainActivity.my.information().adduser(u);
            Toast.makeText(MainActivity.this, "save ", Toast.LENGTH_LONG).show();
            name.setText("");
            age.setText("");
            objective.setText("");
            pass.setText("");
            id.setText("");
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }


}

