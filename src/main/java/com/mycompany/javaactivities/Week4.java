/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivities;

import java.util.Scanner;

public class Week4 {
    public static void main(String[] args) {
        
       //======================= Number & Square Printer ==================//
       System.out.println("=========== Number & Square Printer ===========\n");

       for (int number = 1; number <= 20; number++) {
       System.out.println("Number: " + number + " | Square: " + (number * number));
    } 
       
       
       //======================= Sum Until Sentinel Value ==================//

       Scanner scanner = new Scanner(System.in);

       int total = 0;
       int number;

       System.out.println("\n=========== Sum Until Sentinel Value ===========\n");
       System.out.println("Enter numbers to add.");
       System.out.println("Enter -1 to stop.\n");

       System.out.print("Enter a number: ");
       number = scanner.nextInt();

       while (number != -1) {
           total += number;

           System.out.print("Enter a number: ");
           number = scanner.nextInt();
}

       System.out.println("\nFinal total: " + total); 
      

    
    
       //======================= Pattern Generator With Early Exit ==================//

       System.out.println("\n=========== Pattern Generator With Early Exit ===========\n");

       int size = 5;

       for (int row = 1; row <= size; row++) {

            // Skip row 3
            if (row == 3) {
                continue; // CONTINUE: skips the entire row
            }

            for (int column = 1; column <= row; column++) {

                 // Stop the inner loop when column reaches 3
                 if (column == 3) {
                     break; // BREAK: stops the inner loop early
                 }

                 System.out.print("* ");
        }

        System.out.println();
   }
       
       
       //======================= Warehouse Inventory Scanner ==================//
       int[][] warehouse = {
         {10, 15, 8},
         {20, -1, 12},
         {5, 3, 18}
       };

       int choice;

       do {
           System.out.println("\n=========== Warehouse Inventory Scanner ===========");
           System.out.println("1. Total Inventory");
           System.out.println("2. Find Critically Low Shelf");
           System.out.println("3. Restock Shelf");
           System.out.println("4. Exit");
           System.out.print("Choose an option: ");

           choice = scanner.nextInt();

           switch (choice) {

              case 1:
                  int totalInventory = 0;

                  for (int row = 0; row < warehouse.length; row++) {
                      for (int column = 0; column < warehouse[row].length; column++) {

                          if (warehouse[row][column] == -1) {
                              continue; // CONTINUE: skips damaged shelf
                           }

                           totalInventory += warehouse[row][column];
                      }
                   }

                   System.out.println("Total Inventory: " + totalInventory);
                   break;

             case 2:
                 boolean found = false;

                 for (int row = 0; row < warehouse.length && !found; row++) {
                     for (int column = 0; column < warehouse[row].length; column++) {

                        if (warehouse[row][column] != -1
                                && warehouse[row][column] < 5) {

                           System.out.println("Critically low shelf found at Row "
                                   + (row + 1) + ", Column " + (column + 1));
                           System.out.println("Item count: " + warehouse[row][column]);

                           found = true;
                           break; // BREAK: stops when the first low shelf is found
                        }
                    }
                }

                if (!found) {
                   System.out.println("No critically low shelf found.");
                }
                break;

             case 3:
                 restockShelf(scanner, warehouse);
                 break;

             case 4:
                 System.out.println("Exiting inventory scanner...");
                 break;

             default:
                 System.out.println("Invalid option. Please choose 1-4.");
                }

            } while (choice != 4);

        while (choice != 4); 
    }        



       //======================= Restock Shelf ==================//

       public static void restockShelf(Scanner scanner, int[][] warehouse) {

           System.out.print("Enter row to restock: ");
           int row = scanner.nextInt();

           System.out.print("Enter column to restock: ");
           int column = scanner.nextInt();

           if (row < 1 || row > warehouse.length
                   || column < 1 || column > warehouse[0].length) {

               System.out.println("Invalid shelf location.");
               return; // RETURN: stops restocking when the location is invalid
           }

           if (warehouse[row - 1][column - 1] == -1) {
               System.out.println("Cannot restock. This shelf is damaged.");
               return;
           }

           int amount;

           while (true) {
               System.out.print("Enter restock amount: ");
               amount = scanner.nextInt();

               if (amount > 0) {
                   break;
               }

               System.out.println("Invalid amount. Enter a number greater than 0.");
           }

           warehouse[row - 1][column - 1] += amount;

           System.out.println("Shelf restocked successfully.");
           System.out.println("New item count: "
                   + warehouse[row - 1][column - 1]);
       }
}


