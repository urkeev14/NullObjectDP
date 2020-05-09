/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.customer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author urosv
 */
public abstract class AbstractCustomer {
    
    protected String name;
    public abstract boolean isNull();
    public abstract String getName();
    
    public void wasteTime(){
        try {
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbstractCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
