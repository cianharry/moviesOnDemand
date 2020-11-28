/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Harry
 */
@XmlRootElement
public class Customer {
    
    private int id;
    private String fname;
    private String sname;
    private String address;
    private String email;
    private List<Account> account;
    
    public Customer(){
        
    }

    public Customer(int id, String fname, String sname, String address, String email, List<Account> account) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.address = address;
        this.email = email;
        this.account = account;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }
    
    
}
