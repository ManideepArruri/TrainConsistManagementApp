/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseSeventeenTrainConsistMgmt
 *
 * Use Case      : UC Seventeen - Sort Bogie Names
 *
 * Description   :
 * This program demonstrates how to sort bogie names using
 * Java’s built-in sorting method Arrays.sort().
 *
 * The application:
 * 1. Creates an array of bogie type names.
 * 2. Displays the unsorted bogie list.
 * 3. Uses Arrays.sort() to sort the bogie names alphabetically.
 * 4. Displays the sorted result.
 *
 * Concepts Demonstrated:
 * - Arrays.sort()
 * - Natural ordering
 * - Built-in optimized sorting
 * - Arrays.toString()
 *
 * Author        : Developer
 * Version       : 17.0
 * =============================================================
 */
package com.seveneleven.TrainApp;

import java.util.Arrays;

public class TrainConsistApp {
	
	
    public static void main(String[] args) {

    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        String[] bogieTypes = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "Luxury AC",
                "General"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        Arrays.sort(bogieTypes);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}
