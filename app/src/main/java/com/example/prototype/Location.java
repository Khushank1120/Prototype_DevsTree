package com.example.prototype;

import android.widget.TextView;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "location")
public class Location {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "latitude")
    private double latitude;
    @ColumnInfo(name = "longitude")
    private double longitude;
    @ColumnInfo(name = "distance")
    private float distance;


    Location(TextView name, float latitude, float longitude, String distance) {
        this.name = String.valueOf(name);
        this.latitude = Double.parseDouble(String.valueOf(latitude));
        this.longitude = Double.parseDouble(String.valueOf(longitude));
        this.distance = Float.parseFloat(distance);
    }

    @Ignore
    Location(String latitude, String longitude, String distance) {
        this.latitude = Double.parseDouble(latitude);
        this.longitude = Double.parseDouble(longitude);
        this.distance = Float.parseFloat(distance);
    }

    public Location(double latitude, double longitude, String name, float distance) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.distance = distance;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters for the fields
    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}