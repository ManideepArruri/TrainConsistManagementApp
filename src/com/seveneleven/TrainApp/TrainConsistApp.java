/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseElevenTrainConsistMgmt
 *
 * Use Case      : UC Eleven - Validate Train ID and Cargo Code
 *
 * Description   :
 * This program demonstrates how Regular Expressions (Regex)
 * can be used to validate input formats for Train IDs and
 * Cargo Codes.
 *
 * The application:
 * 1. Accepts Train ID and Cargo Code from the user.
 * 2. Defines regex patterns for valid formats.
 * 3. Uses Pattern and Matcher classes for validation.
 * 4. Displays whether the inputs are valid or invalid.
 *
 * Concepts Demonstrated:
 * - Regular Expressions (Regex)
 * - Pattern class
 * - Matcher class
 * - matches() method
 * - Input validation
 *
 * Author        : Developer
 * Version       : 11.0
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
	

    public static void main(String[] args) {

    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        if (m1.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (m2.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}
