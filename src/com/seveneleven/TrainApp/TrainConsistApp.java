/*
 * =====================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * =====================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This program demonstrates how HashSet ensures that
 * duplicate bogie IDs are not stored in the train system.
 *
 * Operations performed:
 * - Add bogie IDs
 * - Attempt duplicate insertion
 * - Display unique bogie IDs
 *
 * Concepts:
 * Set interface
 * HashSet
 * uniqueness
 * hashing
 *
 * @author Developer
 * @version 3.0
 */
package com.seveneleven.TrainApp;

import java.util.HashSet;
import java.util.Set;
 
public class TrainConsistApp {
    public static void main(String[] args) {
    	
    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIds);
    }
}
