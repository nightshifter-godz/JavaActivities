/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivities;

public class Week5 {
    
    public static void main(String[] args) {
    
    //======================= Favorite Things Array ==================//
    System.out.println("=========== Favorite Things Array ===========\n");

    String[] favorites = {"Music", "Reading Books/Ao3", "Movies", "Milk", "Travel"};

    for (int i = 0; i < favorites.length; i++) {
        System.out.println((i + 1) + ". " + favorites[i]);
    }

    System.out.println("\nTotal number of favorites: " + favorites.length);
    
    
    
    
    //======================= Class Statistics Calculator ==================//
    System.out.println("\n=========== Class Statistics Calculator ===========\n");

    int[] scores = {85, 92, 78, 88, 95, 73, 81, 97};

    int sum = 0;
    int highest = scores[0];
    int lowest = scores[0];

    for (int i = 0; i < scores.length; i++) {
        sum += scores[i];

        if (scores[i] > highest) {
            highest = scores[i];
        }

        if (scores[i] < lowest) {
           lowest = scores[i];
        }
    }

    double average = (double) sum / scores.length;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Highest Score: " + highest);
    System.out.println("Lowest Score: " + lowest);
    
    
    
    
    //======================= Search & Sort Mini-Tool ==================//
    System.out.println("\n=========== Search & Sort Mini-Tool ===========\n");

    int target = 88;
    int foundIndex = -1;

    for (int i = 0; i < scores.length; i++) {
        if (scores[i] == target) {
           foundIndex = i;
           break;
        }
    }

    if (foundIndex != -1) {
       System.out.println("Target " + target + " found at index: " + foundIndex);
    } else {
       System.out.println("Target " + target + " was not found.");
    }

    int[] sortedScores = scores.clone();

    // Sorting a copy keeps the original array unchanged.

    java.util.Arrays.sort(sortedScores);

    System.out.println("\nOriginal Array: " + java.util.Arrays.toString(scores));
    System.out.println("Sorted Array: " + java.util.Arrays.toString(sortedScores));
    
    
    
    //======================= Class Ranking System ==================//
    System.out.println("\n=========== Class Ranking System ===========");

    String[] names = {"Alyssa", "Karl", "Maria", "John"};

    int[][] quizData = {
           {95, 90, 88, 92},
           {85, 80, 90, 85},
           {95, 90, 88, 92},
           {78, 82, 80, 85}
    };

    Student[] students = new Student[names.length];

    for (int i = 0; i < students.length; i++) {
        students[i] = new Student(names[i], quizData[i]);
    }

    // Sort from highest average to lowest average.

    for (int i = 0; i < students.length - 1; i++) {

        for (int j = 0; j < students.length - 1 - i; j++) {

            if (students[j].getAverage() < students[j + 1].getAverage()) {

                Student temp = students[j];
                students[j] = students[j + 1];
                students[j + 1] = temp;
            }
        }
    }

    System.out.println("=========== CLASS LEADERBOARD ===========");

    for (int i = 0; i < students.length; i++) {

        int rank = i + 1;

        if (i > 0 && students[i].getAverage() == students[i - 1].getAverage()) {
            rank = i;
        }

        System.out.printf("%d. %s - Average: %.2f%n",
            rank, students[i].name, students[i].getAverage());
       }

    String searchName = "Maria";
    int foundRank = -1;

    // Check each student until the name is found.

    for (int i = 0; i < students.length; i++) {

        if (students[i].name.equals(searchName)) {

            if (i > 0 && students[i].getAverage() == students[i - 1].getAverage()) {
                foundRank = i;
            } else {
                foundRank = i + 1;
            }

            break;
        }
    }

    if (foundRank != -1) {
        System.out.println("\n" + searchName + " is ranked #" + foundRank);
    } else {
        System.out.println("\n" + searchName + " was not found.");
       }
    }
 

    //======================= Student Class ==================//

    static class Student {

        String name;
        int[] quizzes;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        double getAverage() {

            int total = 0;

            for (int i = 0; i < quizzes.length; i++) {
                total += quizzes[i];
            }

            return (double) total / quizzes.length;
        }
    }
}
