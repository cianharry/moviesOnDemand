/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.service;

import com.mycompany.moviesondemand.model.Account;
import com.mycompany.moviesondemand.model.Customer;
import com.mycompany.moviesondemand.mydatabase.Database;
import java.util.List;

/**
 *
 * @author Harry
 */
public class AccountService {
    Database db = new Database();
    public List<Account> list = db.getAccountDB();
    public List<Customer> clist = db.getCustomerDB();
    
    public List<Account> getAllAccounts(){
        return list;
    }
    
    public List<Account> getAllAccountsByCustomers(int CustomerId){
        return clist.get(CustomerId-1).getAccount();
    }

    public Account getAccount(int id) {
        return list.get(id-1);
    }
}
