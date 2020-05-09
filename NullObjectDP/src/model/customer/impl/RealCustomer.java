/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.customer.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.customer.AbstractCustomer;


public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }
    
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        wasteTime();
        return this.name;
    }
    
}
