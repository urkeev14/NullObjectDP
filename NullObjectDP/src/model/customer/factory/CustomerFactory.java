/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.customer.factory;

import model.customer.AbstractCustomer;
import model.customer.impl.NullCustomer;
import model.customer.impl.RealCustomer;

/**
 *
 * @author urosv
 */
public class CustomerFactory {
    
    public static final String[] names = {"Uros", "Marko", "Nemanja"};
    
    public static AbstractCustomer getCustomer(String name){
        
        for (String existingCustomerName : names) {
            if(existingCustomerName.equalsIgnoreCase(name))
                return new RealCustomer(name);
        }
        
        return new NullCustomer();
    }
    
}
