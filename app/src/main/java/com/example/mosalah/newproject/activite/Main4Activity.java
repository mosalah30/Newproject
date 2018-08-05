package com.example.mosalah.newproject.activite;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mosalah.newproject.R;
import com.example.mosalah.newproject.database.mydatabase;
import com.example.mosalah.newproject.fragment.BlankFragment;
import com.example.mosalah.newproject.fragment.BlankFragment2;

public class Main4Activity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        fragmentManager = getSupportFragmentManager();
       MainActivity.my = Room.databaseBuilder(getApplicationContext(), mydatabase.class, "users").allowMainThreadQueries().build();
    }

    public void onclick(View view) {
        Fragment fragment;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Intent intent;
        switch (view.getId()) {
            case R.id.A4_B_SAVE:
                intent = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.A4_B_Delete:
                fragment = new BlankFragment();
                fragmentTransaction.replace(R.id.h11111, fragment)
                        .commit();
                break;
            case R.id.A4_B_DeleteAll:
                startActivity(new Intent(this, Main2Activity_recycler.class));
               break;
            case R.id.A4_B_Update:
                fragment = new BlankFragment2();
                fragmentTransaction.replace(R.id.h11111, fragment).commit();
                break;
            case R.id.A4_B_View:
                intent = new Intent(Main4Activity.this, Main3Activity.class);
                startActivity(intent);
                break;
        }


    }
}
