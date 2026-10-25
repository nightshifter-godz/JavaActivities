/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivities;

public class Week2 {
    
    public static void main(String[] args) {
    
    //======================= Four-Function Calculator ==================//

        int num1 = 18;
        int num2 = 4;

        System.out.println("\n=========== Four-Function Calculator ===========\n");

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));

        // Division removes the decimal part when using int values.
        // Remainder can also behave differently when negative numbers are used.
        // Integer division is truncated toward zero, while the remainder follows the sign of num1.
        
        
    //======================= Grade Threshold Checker ==================//

        double averageGrade = 89;
        int absences = 2;

        // The student passes if they have an average of at least 75 AND have 3 or less,
        // OR if their average is 90 or higher regardless of absences.
        boolean passed = ((averageGrade >= 75 && absences <= 3) || averageGrade >= 90);

        System.out.println("\n=========== Grade Threshold Checker ===========\n");

        System.out.println("Average grade: " + averageGrade);
        System.out.println("Number of absences: " + absences);

        if (passed) {
           System.out.println("Result: PASS");
           System.out.println("Reason: Congrats! You have met the standard grade and attendance requirements.");
        } else {
           System.out.println("Result: FAIL");
           System.out.println("Reason: Sorry. You have not meet the standard grade and attendance requirements."); 
        }
        
        
    //======================= Compound Growth & Increment Tracker ==================//
    
        System.out.println("\n=========== Compound Growth ===========");

        double balance = 500;

        // tracking the balance while using compound assignments
        // to see how it increases overtime.
        balance += 200;
        System.out.println("\nAfter adding 200: " + balance);

        balance *= 1.05;
        System.out.println("After 5% growth: " + balance);

        balance += 300;
        System.out.println("After saving again: " + balance);


        System.out.println("\n=========== Increment Tracker ===========\n");
        
        // Prefix and postfix increment
        int count = 5;

        System.out.println("Postfix: " + count++);
        System.out.println("After postfix: " + count);
        // Postfix uses the current value first, then increases it by 1.
       
        System.out.println("Prefix: " + ++count);
        System.out.println("After prefix: " + count);
        // Prefix increases the value by 1 first, then uses the updated value.
        
        
    //======================= Precedence Puzzle Solver ==================//
    
        System.out.println("\n======== Precedence Puzzle Solver ========\n");
        
        int x = 5;
        int y = 3;

      // Prediction: false
      boolean test1 = x + y * 2 > 10 && x++ == 5;
      System.out.println("Expression 1: " + test1);
      // The prediction here was wrong because multiplication happens before addition.
      // So 5 + (3 * 2) becomes 11, which is greater than 10.
      // Both sides become true, so the final result is true.

      // Prediction: true
      boolean test2 = x * 2 + y == 15 || ++y > 5;
      System.out.println("Expression 2: " + test2);


      // Prediction: true
      boolean test3 = ++x > y && x + y >= 10;
      System.out.println("Expression 3: " + test3);
    }
}
