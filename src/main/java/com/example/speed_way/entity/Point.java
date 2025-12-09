package com.example.speed_way.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
@Table(name = "points")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double latitude;
    private double longitude;
    private String name;
    private String address;

    public Point() {

    }

    public Point(double latitude, double longitude, String name, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
    }

    public Point(Long id, double latitude, double longitude, String name, String address) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return Double.compare(latitude, point.latitude) == 0 && Double.compare(longitude, point.longitude) == 0 && Objects.equals(id, point.id) && Objects.equals(name, point.name) && Objects.equals(address, point.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, latitude, longitude, name, address);
    }

    @Override
    public String toString() {
        return "Point{" + "id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
