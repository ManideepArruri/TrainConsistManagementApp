/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseTenTrainConsistMgmt
 *
 * Use Case      : UC Ten - Count Total Seats in Train
 *
 * Description   :
 * This program demonstrates how Java Streams can aggregate
 * numeric values using the reduce() operation.
 *
 * The application:
 * 1. Creates a list of passenger bogies.
 * 2. Converts the list into a stream.
 * 3. Extracts capacity values using map().
 * 4. Uses reduce() to calculate the total seating capacity.
 * 5. Displays the total seats available in the train.
 *
 * Concepts Demonstrated:
 * - Java Stream API
 * - map()
 * - reduce()
 * - Method reference
 * - Functional aggregation
 *
 * Author        : Developer
 * Version       : 10.0
 * =============================================================
 */

package com.seveneleven.TrainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


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
        bogies.add(new Bogie("Luxury AC", 80));

        System.out.println("Passenger Bogies:\n");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        int totalSeats =
                bogies.stream()
                      .map(b -> b.capacity)
                      .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
    }
}
