package com.example.mosalah.newproject.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.mosalah.newproject.Interface.information;
import com.example.mosalah.newproject.model.user;

@Database(entities ={ user.class},version = 1)
public abstract class mydatabase extends RoomDatabase
{
    public abstract information information();
}
