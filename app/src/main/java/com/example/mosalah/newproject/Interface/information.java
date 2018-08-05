package com.example.mosalah.newproject.Interface;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.mosalah.newproject.model.user;

import java.util.List;

@Dao
public interface information
{
    @Insert
     void adduser(user user);
    @Query("select * from users")
     List<user> getusers();
    @Delete
    void Delete(user user);
    @Update
    void Update(user user);

}

