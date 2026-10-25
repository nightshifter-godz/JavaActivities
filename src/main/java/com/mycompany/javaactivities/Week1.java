/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivities;


public class Week1 {
    
       
    //==================PERSONAL PROFILE PRINTER=============================//
    public static void main(String[] args) {
        
        int age = 19;
        double height = 5.0;
        char initial = 'A';
        boolean student = true;
        String fullName = "Alyssa Rae C. Jose";
        
        System.out.println("========== Personal Profile Printer =========\n");
        
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "ft");
        System.out.println("Initial: " + initial);
        System.out.println("Student: " + student);
           
    
    
    //===================Type-Safe Shopping Calculator========================//
        
        int quantity = 7;
        double unitPrice = 90.76;
        String storeName = "KKV";
        
        //totalCost should be a double because prices often have decimals or also known as cents.
        double totalCost = quantity * unitPrice;
        
        System.out.println("\n========= Type-Safe Shopping Calculator ========\n");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
        
        
    //========================Unit Cast Converter===========================//

        double cm = 289.5;
        //Explicit casting is used to get WHOLE numbers. The decimal part is removed.
        int meters = (int) (cm / 100);
        double remainingcm = cm % 100; //this gets the remaining cm.
        
        System.out.println("\n=========== Unit Cast Converter ===========\n");
        System.out.println("Centimeters: " + cm);
        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining centimeters: " + remainingcm);
        
        //Implicit widening is an automatic conversion of smaller data type to a larger one (basically int to double).
        // No cast is needed in Implicit widening because double can represent int values.
        int samplenum = 25;
        double widenedNum = samplenum;
        System.out.println("Implicit widening: " + widenedNum);
        
        //Explicit narrowing is a manual conversion of double to int (larger data type to smaller).
        //The decimal portion (.12) is lost.
        double decimalNum = 78.12;
        int narrowedNum = (int) decimalNum;
        System.out.println("Explicit narrowing: " + narrowedNum);
       
    //=======================Overflow & Reference Investigator==================//
    
        byte num = 127;
        num++;
    
        System.out.println("\n============ Overflow & Reference Investigator =============\n");
        System.out.println("Byte after overflow: " + num);
        
        // String references
    
        String text1 = new String("Yellow");
        String text2 = new String("Yellow");
        String text3 = "Yellow";
   
        // == compares whether the variables refer to the SAME object in memory.
        // text1 and text2 were using new, so they are different objects.
        System.out.println("\ntext1 == text2: " + (text1 == text2));

        // text1 is a new String object, while text3 refers to the String literal
        // in the String pool, so they are different objects.
        System.out.println("text1 == text3: " + (text1 == text3));

        // text2 is also a new String object, while text3 refers to the String
        // literal in the String pool, so they are different objects.
        System.out.println("text2 == text3: " + (text2 == text3));

        // .equals() compares the actual text/content. All three contain "Yellow", so these comparisons are true.
        System.out.println("text1.equals(text2): " + text1.equals(text2));
        System.out.println("text1.equals(text3): " + text1.equals(text3));
        System.out.println("text2.equals(text3): " + text2.equals(text3));
        
        // Array reference
        int[] numbers = {10, 20, 30};

        // sharedNumb refers to the SAME array as numbers.
        int[] sharedNum = numbers;
        
        // Changing the array through sharedNum also changes number because both variables are referring to the same array.
        sharedNum[0] = 99;

        System.out.println("\n=== Shared Array Reference ===");
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("sharedNumbers[0]: " + sharedNum[0]);
    
    }
    
}


