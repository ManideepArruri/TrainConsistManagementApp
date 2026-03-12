/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseNineTrainConsistMgmt
 *
 * Use Case      : UC Nine - Group Bogies by Type
 *
 * Description   :
 * This program demonstrates how Java Streams can group bogies
 * into categories using Collectors.groupingBy().
 *
 * The application:
 * 1. Creates a list of bogies.
 * 2. Converts the list into a Stream.
 * 3. Groups bogies based on their type.
 * 4. Stores the grouped result inside a Map.
 * 5. Displays grouped bogie information.
 *
 * Concepts Demonstrated:
 * - Java Stream API
 * - groupingBy()
 * - Collectors
 * - Map<String, List<Bogie>>
 * - Lambda expressions
 *
 * Author        : Developer
 * Version       : 9.0
 * =============================================================
 */

package com.seveneleven.TrainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TrainConsistApp {
	static class Bogie {

		String name;
		String type;
		int capacity;

		public Bogie(String name, String type, int capacity) {
			this.name = name;
			this.type = type;
			this.capacity = capacity;
		}

		public String getType() {
			return type;
		}

		public String toString() {
			return name + " - " + type + " - Capacity: " + capacity;
		}
	}
	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("      === Train Consist Management App ===");
		System.out.println("====================================================\n");

		List<Bogie> bogies = new ArrayList<>();

		bogies.add(new Bogie("Sleeper Coach", "Passenger", 72));
		bogies.add(new Bogie("AC Chair Car", "Passenger", 56));
		bogies.add(new Bogie("Coal Wagon", "Goods", 0));
		bogies.add(new Bogie("Petroleum Tanker", "Goods", 0));

		Map<String, List<Bogie>> groupedBogies =
				bogies.stream()
				.collect(Collectors.groupingBy(Bogie::getType));

		System.out.println("Grouped Bogies:\n");

		for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

			System.out.println(entry.getKey() + " Bogies:");

			for (Bogie b : entry.getValue()) {
				System.out.println("   " + b);
			}

			System.out.println();
		}
	}
}
