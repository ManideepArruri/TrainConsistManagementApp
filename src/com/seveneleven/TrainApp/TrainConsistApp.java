/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseEighteenTrainConsistMgmt
 *
 * Use Case      : UC Eighteen - Linear Search for Bogie ID
 *
 * Description   :
 * This program demonstrates how Linear Search works on an
 * unsorted array of bogie IDs.
 *
 * The application:
 * 1. Creates an array of bogie IDs.
 * 2. Accepts a bogie ID to search.
 * 3. Traverses the array sequentially.
 * 4. Compares each element with the search key.
 * 5. Displays whether the bogie ID exists.
 *
 * Concepts Demonstrated:
 * - Linear Search algorithm
 * - Sequential traversal
 * - String comparison using equals()
 * - Early termination when match found
 *
 * Author        : Developer
 * Version       : 18.0
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
        String searchKey = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break;
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
