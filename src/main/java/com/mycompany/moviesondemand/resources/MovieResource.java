/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.resources;

import com.mycompany.moviesondemand.model.Movie;
import com.mycompany.moviesondemand.service.MovieService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author aaron
 */
@Path("/movies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MovieResource {
    MovieService movieService = new MovieService();
    
    @GET
    public List<Movie> getAllMovies() {
    return movieService.getAllMovies();
    }
    
    @GET
    @Path("/{id}")
    public Movie getMovie(@PathParam("id") int id) {
        return movieService.getMovie(id);
    }
    
    @POST
    public Movie postMovie(Movie m) {
        return movieService.createMovie(m);
    }

}
