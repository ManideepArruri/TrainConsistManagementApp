/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseSixteenTrainConsistMgmt
 *
 * Use Case      : UC Sixteen - Manual Sorting using Bubble Sort
 *
 * Description   :
 * This program demonstrates how a basic sorting algorithm
 * (Bubble Sort) works without using built-in sorting methods.
 *
 * The application:
 * 1. Creates an array of passenger bogie capacities.
 * 2. Uses nested loops to compare adjacent elements.
 * 3. Swaps elements if they are out of order.
 * 4. Repeats the process until the array becomes sorted.
 *
 * Concepts Demonstrated:
 * - Bubble Sort Algorithm
 * - Nested loops
 * - Array manipulation
 * - Swapping values
 *
 * Author        : Developer
 * Version       : 16.0
 * =============================================================
 */
package com.seveneleven.TrainApp;

import java.util.Arrays;

public class TrainConsistApp {
	
	
    public static void main(String[] args) {

    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        int[] capacities = {72, 56, 48, 80, 90};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Bubble Sort:");
        System.out.println(Arrays.toString(capacities));
    }
}
