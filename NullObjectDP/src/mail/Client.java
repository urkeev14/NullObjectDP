/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import model.customer.AbstractCustomer;
import model.customer.factory.CustomerFactory;

/**
 *
 * @author urosv
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Uros");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Michael");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Nemanja");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Lara");

        System.out.println("***Customers***\n");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }

}
