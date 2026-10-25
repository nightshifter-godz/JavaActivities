/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivities;

public class Week3 {
    
    public static void main(String[] args) {
        
        //============ Simple Grade Classifier ===========//
        
        System.out.println("=========== Simple Grade Classifier ===========\n");
        int score = 57;
        
        if (score >= 60) {
            System.out.println("Score: " + score);
            System.out.println("PASSED");
        } else {
            System.out.println("Score " + score);
            System.out.println("FAILED");
        }
        
        
        
        //============ Multi-Tier Discount System ===========//
        
        System.out.println("\n=========== Multi-Tier Discount System ===========\n");
        double purchaseAmount = 4500;
        double discount;
        
        if (purchaseAmount >= 5000) {
            discount = 0.15;
        } else if (purchaseAmount >= 3000) {
            discount = 0.10;
        } else if (purchaseAmount >= 2000) {
            discount = 0.05;
        } else {
            discount = 0.00; 
        }
        
        double discountedPrice = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Purchase Amount: ₱" + purchaseAmount);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final Price: ₱" + discountedPrice);
    
    
        
    
    //======================= Nested Login Validator =================//
        System.out.println("\n=========== Nested Login Validator ===========\n");

        String username = "student";
        String password = "12345";
        boolean accountLocked = false;

        if (username.equals("student")) {

            if (password.equals("12345")) {

                if (!accountLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }

        } else {
        System.out.println("Login failed: Incorrect password.");
        }

        } else {
        System.out.println("Login failed: Incorrect username.");
   }
        
     
    
    //======================= Atm Transaction Organizer =================//
       System.out.println("\n ============ Atm Transaction Organizer=============\n");
    
       String atmUsername = "student";
       int pin = 1234;

       double balance = 12000;
       double withdrawal = 3000;

       String tier;
       double dailyLimit;
       double feeRate;


       // Login check
       if (username.equals("student")) {

           if (pin == 1234) {

               // Determine account tier
               if (balance >= 20000) {
                   tier = "Platinum";
                   dailyLimit = 10000;
           } else if (balance >= 10000) {
                   tier = "Gold";
                   dailyLimit = 5000;
           } else if (balance >= 5000) {
                  tier = "Silver";
                  dailyLimit = 3000;
           } else {
                  tier = "Bronze";
                  dailyLimit = 1000;
            }


           // Determine transaction fee
           switch (tier) {
               case "Platinum":
                   feeRate = 0.01;
                   break;
               case "Gold":
                   feeRate = 0.02;
                   break;
              case "Silver":
                   feeRate = 0.03;
                   break;
              default:
                   feeRate = 0.05;
        }


        // Withdrawal check
        if (withdrawal <= balance) {

            if (withdrawal <= dailyLimit) {

                double fee = withdrawal * feeRate;
                double total = withdrawal + fee;

                if (total <= balance) {
                    System.out.println("Transaction APPROVED");
                    System.out.println("Account Tier: " + tier);
                    System.out.println("Withdrawal: ₱" + withdrawal);
                    System.out.println("Fee: ₱" + fee);
                    System.out.println("Remaining Balance: ₱" + (balance - total));
                } else {
                    System.out.println("Transaction DENIED");
                    System.out.println("Reason: Insufficient balance after including the transaction fee.");
                }

            } else {
                System.out.println("Transaction DENIED");
                System.out.println("Reason: Withdrawal exceeds the daily limit for the " + tier + " tier.");
            }

        } else {
            System.out.println("Transaction DENIED");
            System.out.println("Reason: Insufficient balance.");
        }

    } else {
        System.out.println("Transaction DENIED");
        System.out.println("Reason: Incorrect PIN.");
    }

} else {
    System.out.println("Transaction DENIED");
    System.out.println("Reason: Incorrect username.");
}

        
  }      
}