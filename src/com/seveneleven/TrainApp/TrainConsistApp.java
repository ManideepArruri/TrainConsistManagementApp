/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseNineteenTrainConsistMgmt
 *
 * Use Case      : UC Nineteen - Binary Search for Bogie ID
 *
 * Description   :
 * This program demonstrates how Binary Search works on a
 * sorted array of bogie IDs.
 *
 * The application:
 * 1. Creates a sorted array of bogie IDs.
 * 2. Accepts a bogie ID to search.
 * 3. Uses the Binary Search algorithm.
 * 4. Repeatedly divides the search range in half.
 * 5. Displays whether the bogie ID exists.
 *
 * Concepts Demonstrated:
 * - Binary Search algorithm
 * - Divide and conquer strategy
 * - Sorted data requirement
 * - compareTo() for string comparison
 *
 * Author        : Developer
 * Version       : 19.0
 * =============================================================
 */
package com.seveneleven.TrainApp;

import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistApp {
	
	
    public static void main(String[] args) {

    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        String[] bogieIds = {
                "BG101",
                "BG102",
                "BG103",
                "BG104",
                "BG105"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                found = true;
                break;
            }
            else if (comparison < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID found in train consist.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}
