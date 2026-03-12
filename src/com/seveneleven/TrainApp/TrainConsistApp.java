/*
 * =====================================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * =====================================================
 *
 * Use Case 7: Sort Passenger Bogies by Capacity
 *
 * Description:
 * Demonstrates sorting of custom objects using
 * Comparator and List collections.
 *
 * Concepts:
 * Custom class
 * Comparator
 * List sorting
 * Lambda expression
 * 
 * @author - developer
 * @version - 7.0.0
 */

package com.seveneleven.TrainApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

 
public class TrainConsistApp {
	static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }
    public static void main(String[] args) {
    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));

        System.out.println("Before Sorting:\n");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity:\n");

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}
