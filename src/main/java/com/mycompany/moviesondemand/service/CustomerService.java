/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.service;

import com.mycompany.moviesondemand.model.Customer;
import com.mycompany.moviesondemand.mydatabase.Database;
import java.util.List;

/**
 *
 * @author Harry
 */
public class CustomerService {
    Database db = new Database();
    public List<Customer> clist = db.getCustomerDB();
    
    public List<Customer> getAllCustomers(){
        return clist;
    }

    public Customer getCustomer(int id) {
        return clist.get(id-1);
    }
    
    public Customer createCustomer(Customer c) {
        c.setId(clist.size() + 1);
        clist.add(c);
        System.out.println("201 - resource created with path: /movie/" + String.valueOf(c.getId()));
        return c;
    }
}
