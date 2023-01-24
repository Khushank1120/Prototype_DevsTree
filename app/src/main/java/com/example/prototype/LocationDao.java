package com.example.prototype;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface LocationDao {

    @Query("Select * From location")
    List<Location>  getAllLocations();

    @Insert
    void add (Location location);

    @Update
    void update (Location location);

    @Delete
    void delete (Location location);


}

