package com.roger.domain;

/**
 * Created by Roger on 2016/12/7.
 */
public class Location {

    private String place;

    private String year;

    public Location() {
    }

    public Location(String place, String year) {
        this.place = place;
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
