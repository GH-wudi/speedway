package com.example.speed_way.entity;

import java.util.Objects;

public class Point {
    private double latitude;
    private double longitude;

    public Point() {

    }

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(latitude, point.latitude) == 0 && Double.compare(longitude, point.longitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }

    @Override
    public String toString() {
        return "Point{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
