/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseTwentyTrainConsistMgmt
 *
 * Use Case      : UC Twenty - Exception Handling During Search
 *
 * Description   :
 * This program demonstrates defensive programming by preventing
 * search operations when the train consist is empty.
 *
 * Rule:
 * Searching should not be allowed if there are no bogies.
 *
 * If the train consist is empty, the system throws an
 * IllegalStateException to stop the operation early.
 *
 * Concepts Demonstrated:
 * - Defensive programming
 * - IllegalStateException
 * - Fail-fast validation
 * - Runtime exception handling
 *
 * Author        : Developer
 * Version       : 20.0
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

        String[] bogieIds = {};  // empty train

        Scanner sc = new Scanner(System.in);

        try {

            if (bogieIds.length == 0) {
                throw new IllegalStateException("Search operation not allowed. Train has no bogies.");
            }

            System.out.print("Enter Bogie ID to search: ");
            String key = sc.nextLine();

            boolean found = false;

            for (String id : bogieIds) {

                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID found in train consist.");
            } else {
                System.out.println("Bogie ID not found.");
            }

        }
        catch (IllegalStateException e) {

            System.out.println("Exception Occurred: " + e.getMessage());

        }

        sc.close();
    }
}
