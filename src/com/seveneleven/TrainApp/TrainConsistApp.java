/*
 * =====================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * =====================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs
 *
 * Description:
 * Demonstrates how LinkedList models the physical order
 * of bogies in a train consist.
 *
 * Operations performed:
 * - Add bogies
 * - Insert bogie at a position
 * - Remove first and last bogie
 * - Display final train formation
 *
 * Concepts:
 * LinkedList
 * addFirst()
 * addLast()
 * add(index, element)
 * removeFirst()
 * removeLast()
 * @author - developer
 * @version - 4.0.0
 */
package com.seveneleven.TrainApp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
 
public class TrainConsistApp {
    public static void main(String[] args) {
    	
    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Formation:");
        System.out.println(trainConsist);

        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry Car at Position 2:");
        System.out.println(trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);
    }
}
