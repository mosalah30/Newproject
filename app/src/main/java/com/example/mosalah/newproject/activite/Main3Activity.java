package com.example.mosalah.newproject.activite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mosalah.newproject.R;
import com.example.mosalah.newproject.model.user;

import java.util.List;

public class Main3Activity extends AppCompatActivity {
    TextView txt_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        try {
            List<user> list = MainActivity.my.information().getusers();
            txt_user = findViewById(R.id.tex_tView);
            String h = "";
            for (user li : list) {
                int i = li.getId();
                int g = li.getAge();
                String j = li.getJob();
                String p = li.getPass();
                String n = li.getName();
                h = h + "\n\n" + "id: " + i + "\n" + "name: " + n + "\n" + "age: " + g + "\n" + "password: " +
                        p + "\n" + "job: " + j;
            }
            txt_user.setText(h);


        } catch (Exception e) {
//message from exception
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
