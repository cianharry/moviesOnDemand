/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondemand.mydatabase;

import com.mycompany.moviesondemand.model.Account;
import com.mycompany.moviesondemand.model.Customer;
import com.mycompany.moviesondemand.model.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaron
 */
public class Database {
    public static List<Movie> movieDB = new ArrayList<>();
    public static List<Customer> customerDB = new ArrayList<>();
    public static List<Account> accountDB = new ArrayList<>();
    public static boolean init = true;

    public Database() {
        if(init){
            Movie m1 = new Movie(1,"The Shawshank Redemption","03/03/1995","",true,true);
            Movie m2 = new Movie(2,"Space Jam","21/03/1997","",true,true);
            Movie m3 = new Movie(3,"Goodfellas","23/11/1990","",true,true);
            Movie m4 = new Movie(4,"Adam & Paul ft. Aaron Reilly","12/12/2020","",true,true);
            Movie m5 = new Movie(5,"Kevin & Perry","21/04/2020","",true,true);
            Movie m6 = new Movie(6,"Jaws","20/06/1975","",true,true);
            
            movieDB.add(m1);
            movieDB.add(m2);
            movieDB.add(m3);
            movieDB.add(m4);
            movieDB.add(m5);
            movieDB.add(m6);
            
            Customer c1 = new Customer(1,"John","Giles","1 ShammGod Lane","J.Giles@email.com", accountDB);
            Customer c2 = new Customer(2,"Diego","Maradonna","2 Coke Avenue","GOAT@email.com", accountDB);
            Customer c3 = new Customer(3,"Paul","Scholes","69 Old Trafford","ginger@email.com", accountDB);
            Customer c4 = new Customer(4,"Roy","Keane","Cork bai","rebel@email.com", accountDB);
            Customer c5 = new Customer(5,"Cristiano","Ronaldo","3, Madrid","Goat2@email.com", accountDB);
            
            customerDB.add(c1);
            customerDB.add(c2);
            customerDB.add(c3);
            customerDB.add(c4);
            customerDB.add(c5);
            
            Account a1 = new Account(1,"cian","*******", movieDB);
            Account a2 = new Account(2,"aaron","*******", movieDB);
            Account a3 = new Account(3,"conor","*******", movieDB);
            Account a4 = new Account(4,"shane","*******", movieDB);
            Account a5 = new Account(5,"alex","*******", movieDB);
            Account a6 = new Account(6,"muhammad","*******", movieDB);
            Account a7 = new Account(7,"luci","*******", movieDB);
            
            accountDB.add(a1);
            accountDB.add(a2);
            accountDB.add(a3);
            accountDB.add(a4);
            accountDB.add(a5);
            accountDB.add(a6);
            accountDB.add(a7);  
            
            init = false;
        }
    }
    
    public List<Movie> getMovieDB(){
        return movieDB;
    }
    
    public List<Customer> getCustomerDB(){
        return customerDB;
    }
    
     public List<Account> getAccountDB(){
        return accountDB;
    }
}
