/*
 * author : Developer
 * version : 2.0
 *  */

package com.seveneleven.TrainApp;

import java.util.ArrayList;
import java.util.List;
 
public class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("UC2 - Add Passenger Bogies to Train");
 
        List<String> passengerBogies = new ArrayList<>();
 
        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
 
        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);
 
        // Remove one bogie
        passengerBogies.remove("AC Chair");
 
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);
 
        // Check existence
        boolean containsSleeper = passengerBogies.contains("Sleeper");
 
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + containsSleeper);
 
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);
 
        System.out.println("\nUC2 operations completed successfully...");
    }
}
