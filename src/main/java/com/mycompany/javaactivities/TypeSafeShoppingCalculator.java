/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivities;

public class TypeSafeShoppingCalculator { 
    
    public static void main(String[] args) {
        
        int quantity = 7;
        double unitPrice = 90.75;
        String storeName = "KKV";
        
        // totalCost should not be an int because prices often have decimal places like cents.
        double totalCost = quantity * unitPrice;
        
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
        
        
    }
    
}
