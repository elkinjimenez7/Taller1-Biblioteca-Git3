/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elkin jimenez
 */
public class Main {
    
    static ArrayList<Customer> customer = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public void createCustomer(String kindCustomer, int id, String name, String cc, int age){
        
        Customer newCustomer = new Customer(kindCustomer, id, name, cc, age);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
