/*
 * author : Developer
 * version : 1.0
 *  */

package com.seveneleven.TrainApp;

import java.util.ArrayList;
import java.util.List;

public class UseCaseOneTrainApp {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("=== Train Consist Management App ===");
		System.out.println("====================================");
		List<String> trainConsist = new ArrayList<>();
		System.out.println("Train Initialized Successfully");
		System.out.println("Initial Bogie Count : "+trainConsist.size());
		System.out.println("Current Train Consist : "+trainConsist);
		System.out.println("System ready for operations...");
	}

}
