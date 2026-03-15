/*
 * ==============================================================
 * MAIN CLASS – UseCase14TrainConsistMgmt
 * ==============================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception.
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity ≤ 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * @author Developer
 * @version 14.0
 */

package com.seveneleven.TrainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class TrainConsistApp {
	
	// -----------------------------
    // CUSTOM EXCEPTION
    // -----------------------------
    static class InvalidCapacityException extends Exception {

        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // -----------------------------
    // Passenger Bogie Model
    // -----------------------------
    static class PassengerBogie {

        private String bogieType;
        private int capacity;

        public PassengerBogie(String bogieType, int capacity)
                throws InvalidCapacityException {

            // Fail-fast validation
            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Capacity must be greater than zero");
            }

            this.bogieType = bogieType;
            this.capacity = capacity;
        }

        public String getBogieType() {
            return bogieType;
        }

        public int getCapacity() {
            return capacity;
        }

        public void display() {
            System.out.println(
                    "Created Bogie: " + bogieType + " -> " + capacity);
        }
    }
    public static void main(String[] args) {

    	try {

            // Valid bogie creation
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            sleeper.display();

            // Invalid bogie creation
            PassengerBogie invalid = new PassengerBogie("General", 0);

        } catch (InvalidCapacityException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}
