/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.resources;

import com.mycompany.moviesondemand.model.Customer;
import com.mycompany.moviesondemand.service.CustomerService;
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
 * @author Harry
 */
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
   
    private final CustomerService customerService = new CustomerService();
    
    @GET
     public List<Customer> getAllCustomers() {
     return customerService.getAllCustomers();
     }

     @GET
     @Path("/{id}")
     public Customer getCustomer(@PathParam("id") int id) {
         return customerService.getCustomer(id);
     }

     @POST
     public Customer postCustomer(Customer c) {
        return customerService.createCustomer(c);
     }
     
    @Path("/{id}/accounts")
    public AccountResource getAccountsResource(){
        System.out.println("Getting accounts subresources...");
        return new AccountResource();
    }
}
