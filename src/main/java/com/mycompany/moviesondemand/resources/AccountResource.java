/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.resources;

import com.mycompany.moviesondemand.model.Account;
import com.mycompany.moviesondemand.service.AccountService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Harry
 */
@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource {
    
    private final AccountService accountService = new AccountService();
    
    @GET
    public List<Account> getAccounts(@PathParam("CustomerId") int id) {
        System.out.println("get all accounts for customer..."+ id);
        return accountService.getAllAccounts();
    }
    
    @GET
    @Path("/{id}")
    public Account getAccount(@PathParam("id") int id) {
        return accountService.getAccount(id);
    }
    
    @Path("/{id}/movies")
    public MovieResource getMoviesResource(){
        System.out.println("Getting movies subresources...");
        return new MovieResource();
    }
}
