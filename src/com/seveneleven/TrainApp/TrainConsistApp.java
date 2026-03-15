/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseThirteenTrainConsistMgmt
 *
 * Use Case      : UC Thirteen - Performance Comparison
 *
 * Description   :
 * This program compares the execution time of traditional
 * loop-based filtering versus Stream API filtering.
 *
 * The application:
 * 1. Creates a list of passenger bogies.
 * 2. Filters bogies using a normal loop.
 * 3. Measures execution time using System.nanoTime().
 * 4. Filters bogies using Stream API.
 * 5. Compares execution durations.
 *
 * Concepts Demonstrated:
 * - Performance benchmarking
 * - System.nanoTime()
 * - Loop processing
 * - Stream API filtering
 *
 * Author        : Developer
 * Version       : 13.0
 * =============================================================
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
	
	static class Bogie {

        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }
    public static void main(String[] args) {

    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Luxury AC", 80));
        bogies.add(new Bogie("General", 90));

        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();

        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();

        List<Bogie> streamResult =
                bogies.stream()
                      .filter(b -> b.capacity > 60)
                      .collect(Collectors.toList());

        long endStream = System.nanoTime();

        long streamTime = endStream - startStream;

        System.out.println("Loop Filtering Result:");
        for (Bogie b : loopResult) {
            System.out.println(b);
        }

        System.out.println("\nStream Filtering Result:");
        for (Bogie b : streamResult) {
            System.out.println(b);
        }

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");
    }
}
