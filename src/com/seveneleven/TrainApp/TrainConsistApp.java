/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseEightTrainConsistMgmt
 *
 * Use Case      : UC Eight - Filter Passenger Bogies using Streams
 *
 * Description   :
 * This program demonstrates how the Java Stream API can be used
 * to filter passenger bogies based on seating capacity.
 *
 * The application:
 * 1. Creates a list of passenger bogies.
 * 2. Converts the list into a Stream pipeline.
 * 3. Applies a filter condition to select bogies with capacity > 60.
 * 4. Collects the filtered bogies into a new list.
 * 5. Displays the filtered result.
 *
 * Concepts Demonstrated:
 * - Java Stream API
 * - stream()
 * - filter()
 * - Lambda expressions
 * - collect()
 * - Collectors.toList()
 *
 * Author        : Developer
 * Version       : 8.0
 * =============================================================
 */

package com.seveneleven.TrainApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 
public class TrainConsistApp {
	static class Bogie {

        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
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

        System.out.println("All Bogies:\n");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        List<Bogie> filteredBogies =
                bogies.stream()
                      .filter(b -> b.capacity > 60)
                      .collect(Collectors.toList());

        System.out.println("\nBogies with Capacity > 60:\n");

        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }
    }
}
