/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseFifteenTrainConsistMgmt
 *
 * Use Case      : UC Fifteen - Safe Cargo Assignment
 *
 * Description   :
 * This program demonstrates how runtime exceptions can be
 * handled safely using try-catch-finally.
 *
 * Rule:
 * Petroleum cargo cannot be assigned to a Rectangular bogie.
 *
 * If an unsafe assignment occurs, CargoSafetyException is thrown
 * and handled gracefully without crashing the program.
 *
 * Concepts Demonstrated:
 * - Runtime Exception
 * - try block
 * - catch block
 * - finally block
 * - throw keyword
 *
 * Author        : Developer
 * Version       : 15.0
 * =============================================================
 */
package com.seveneleven.TrainApp;



public class TrainConsistApp {
	
	static class CargoSafetyException extends RuntimeException {

        public CargoSafetyException(String message) {
            super(message);
        }
    }
	static class GoodsBogie {

        String shape;
        String cargo;

        public void assignCargo(String shape, String cargo) {

            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment detected!");
            }

            this.shape = shape;
            this.cargo = cargo;

            System.out.println("Cargo assigned successfully: " + cargo);
        }
    }
    public static void main(String[] args) {

    	System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        GoodsBogie bogie = new GoodsBogie();

        try {

            bogie.assignCargo("Rectangular", "Petroleum");

        }
        catch (CargoSafetyException e) {

            System.out.println("Exception Occurred: " + e.getMessage());

        }
        finally {

            System.out.println("Cargo assignment attempt completed.");

        }

        System.out.println("\nProgram continues running...");
    }
}
