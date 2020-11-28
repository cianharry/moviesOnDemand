/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.service;

import com.mycompany.moviesondemand.model.Account;
import com.mycompany.moviesondemand.model.Movie;
import com.mycompany.moviesondemand.mydatabase.Database;
import java.util.List;

/**
 *
 * @author aaron
 */
public class MovieService {
    Database db = new Database();
    public List<Movie> mlist = db.getMovieDB();
    public List<Account> alist = db.getAccountDB();
    
    public List<Movie> getAllMovies(){
        return mlist;
    }
    
    public List<Movie> getAllMoviesByAccount(int AccountId){
        return alist.get(AccountId-1).getMovie();
    }

    public Movie getMovie(int id) {
        return mlist.get(id-1);
    }
    
    public Movie createMovie(Movie m) {
        m.setId(mlist.size() + 1);
        mlist.add(m);
        System.out.println("201 - resource created with path: /movie/" + String.valueOf(m.getId()));
        return m;
    }
}
