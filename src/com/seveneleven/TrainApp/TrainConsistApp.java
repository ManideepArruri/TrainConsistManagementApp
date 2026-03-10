/*
 * =====================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * =====================================================
 *
 * Use Case 6: Map Bogie to Capacity
 *
 * Description:
 * Demonstrates how HashMap stores bogie names
 * along with their seating capacity using
 * key-value mapping.
 *
 * Operations performed:
 * - Create HashMap
 * - Insert bogie and capacity
 * - Iterate through map entries
 * - Display bogie capacity
 *
 * Concepts:
 * Map interface
 * HashMap
 * put()
 * entrySet()
 * key-value mapping
 * @author - developer
 * @version - 6.0.0
 */

package com.seveneleven.TrainApp;

import java.util.HashMap;
import java.util.Map;

 
public class TrainConsistApp {
    public static void main(String[] args) {
    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 48);

        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie : " + entry.getKey() +
                               " | Capacity : " + entry.getValue());
        }
    }
}
