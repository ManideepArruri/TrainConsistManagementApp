/*
 * =====================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * =====================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * Demonstrates how LinkedHashSet maintains insertion order
 * while preventing duplicate bogies in the train formation.
 *
 * Operations performed:
 * - Add bogies
 * - Attempt duplicate insertion
 * - Display ordered formation
 *
 * Concepts:
 * Set interface
 * LinkedHashSet
 * insertion order preservation
 * automatic duplicate prevention
 * @author - developer
 * @version  - 5.0.0
 */
package com.seveneleven.TrainApp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
 
public class TrainConsistApp {
    public static void main(String[] args) {
    	
    	 System.out.println("====================================================");
         System.out.println("      === Train Consist Management App ===");
         System.out.println("====================================================\n");

         Set<String> trainFormation = new LinkedHashSet<>();

         trainFormation.add("Engine");
         trainFormation.add("Sleeper");
         trainFormation.add("Cargo");
         trainFormation.add("Guard");

         trainFormation.add("Sleeper"); // duplicate attempt

         System.out.println("Final Train Formation:");
         System.out.println(trainFormation);
    }
}
