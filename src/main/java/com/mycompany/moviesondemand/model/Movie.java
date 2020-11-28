/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.model;

/**
 *
 * @author aaron
 */
 
public class Movie {
    public int id;
    public String name;
    public String date;
    public String summary;
    public boolean watched;
    public boolean recommended;

    public Movie() {
    }
    
    public Movie(int id, String name, String date, String summary, boolean watched, boolean recommended) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.summary = summary;
        this.watched = watched;
        this.recommended = recommended;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
    
    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

       
}
