/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.model;

import java.util.List;

/**
 *
 * @author Harry
 */
public class Account {
    
    private int id;
    private String username;
    private String password;
    private List<Movie> movie;
    
    public Account(){
        
    }

    public Account(int id, String username, String password, List<Movie> movie) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.movie = movie;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }
    
    
}
