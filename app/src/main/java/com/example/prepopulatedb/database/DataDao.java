package com.example.prepopulatedb.database;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DataDao {

    @Query("SELECT * FROM DataEntity")
    List<DataEntity> getAll();

    @Insert
    void insertAll(DataEntity... dataEntities);


}
