/*
 * ICSI 201 Project 1: Range Overlap
 * State University of New York, University at Albany
 * Developed by Ayan Cooper, CS Major, Class of 2026
 */

import java.util.Scanner; 

public class RangeOverlap {
	public static void main(String[] args) 
	{

		// Create a Scanner object to read input.
	    Scanner keyboard = new Scanner (System.in);
		
		// Variables used for determining ranges.
		int start1;
		int end1;
		int start2;
		int end2;
		int overlap = 0; // Variable used to count how many numbers overlap between the two ranges.
		
		/* 
		 * STEP 1
		 * Implement information message stating
		 * --------------------------------
		 * This program takes as an input the start and end limits of two integer ranges.
		 * It then prints out the value overlap and the percentage overlap between the ranges.
		 * -------------------------------- 
		 */
		
		/*
		 * This segment of code displays information to the user on what this program does.
		 */
		System.out.println("--------------------------------");
		System.out.println("This program takes as an input the start and end limits of two integer ranges.");
		System.out.println("It then prints out the value overlap and the percentage overlap between"
				+ " the ranges.");
		System.out.println("--------------------------------");

		/*
		 * STEP 2 - 4
		 * Gather user input and check for input correctness. Keep asking the user for input
		 * until they specify proper ranges (i.e. until the start limits of both ranges are 
		 * smaller or equal than the end ranges). 
		 */

		/*
		 * This segment of code uses a for loop to rerun all of the code within the for loop in case the
		 * user enters a wrong set of ranges.
		 */
		for (int r = 0; r <=1; r++) {
			/*
			 * This segment of code in the main for loop takes values from the user and creates
			 * the ranges using those values.
			 */
			System.out.println("");
			System.out.println("Please specify the start limit of your first range");
			// Take value from user
			start1 = keyboard.nextInt();
			
			System.out.println("Please specify the end limit of your first range");
			// Take value from user
			end1 = keyboard.nextInt();
			
			System.out.println("Please specify the start limit of your second range");
			// Take value from user
			start2 = keyboard.nextInt();
			
			System.out.println("Please specify the end limit of your second range");
			// Take value from user
			end2 = keyboard.nextInt();

		/* 
		 * Implement range summary message stating:
		 * --------------------------------
		 * You have specified the following ranges:
		 * 		Range 1: <RANGE_START - RANGE_END>
		 * 		Range 2: <RANGE_START - RANGE_END>
		 * --------------------------------
		 * 
		 * Note the tab indentation before the words "Range".
		 * See Examples 1-7 for how to format this summary.
		 */
			
			/*
			 * This segment of code displays the ranges the user has created with
			 * the values they entered.
			 */
			System.out.println("--------------------------------");
			System.out.println("You have specified the following ranges:");
			System.out.println("	Range 1: " + start1 + " - " + end1);
			System.out.println("	Range 2: " + start2 + " - " + end2);
			System.out.println("--------------------------------");
		
		/*
		 * Check range limits for correctness and display the following error message 
		 * if the ranges are incorrect.
		 *  --------------------------------
		 *  ERROR: Your input is incorrect.
		 *  Ensure that the start limit is smaller or equal than the end limit for both ranges.
		 *  --------------------------------
		 */
			
			/*
			 * This segment of code displays an error message in case the
			 * the first start limit the user creates is less than or equal to the two end values they created.
			 * In that case, the program shall rerun from line 41.
			 */
			if (start1 >= end1 || start1 >= end2) {
				System.out.println("--------------------------------");
				System.out.println("ERROR: Your input is incorrect.");
				System.out.println("Ensure that the start limit is smaller or equal than the end limit for "
						+ "both ranges.");
				System.out.println("--------------------------------");
				continue;		
			}
			
		/*
		 * STEP 5
		 * Calculate the value overlap between the two ranges *using loop structures*.
		 * 
		 * Your code goes here.
		 */
			
			else {
				/*
				 * Here, after correct input is provided, this segment of code  uses 4 for loops
				 * to display the numbers overlapping between the two ranges, while also counting
				 * how many numbers overlap. The use of 4 for loops is to account for various 
				 * ranges.
				 */
				
				int i = start1;
				int j = start2;
				
		/* 
		 * 
		 * Display the value overlap to the user, or a message that the range is empty.
		 * For overlapping ranges, your output should read:
		 * 
		 * The overlap between the two ranges is: <RANGE>.
		 * 
		 * For non-overlapping ranges, your output should read:
		 * 
		 * The two ranges do not overlap.
		 * 
		 * See Examples 1-6 from the assignment for how to format your output for overlapping ranges.
		 * See Example 7 from the assignment for how to format your output for non-overlapping ranges. 
		 */
		
		/* 
		 * Your code goes here.
		 */
				
				/*
				 * In case the end limit of the first range is less than the start limit of the second range,
				 * this segment of code informs the user that the two ranges don't overlap.
				 */
				if (end1 <= start2){
						System.out.print("The two ranges do not overlap.");
				}
				
				else if (start1 <= start2 && end1 <= end2) {
					System.out.print("The overlap between the two ranges is:"); 
					for (i = start1; i <= end1; i++) {
						if (i == j && j <= end2) {
							overlap++;
							j++;
							System.out.print(" " + i + "");
							
						}
					}
					System.out.print(".");
				}
				
				else if (start1 <= start2 && end1 >= end2) {
					System.out.print("The overlap between the two ranges is:"); 
					for (i = start1; i <= end1; i++) {
						if (i == j && j <= end2) {
							overlap++;
							j++;
							System.out.print(" " + i + "");
						}
					}
					System.out.print(".");
				}
				
				else if (start2 <= start1 && end1 <= end2) {
					System.out.print("The overlap between the two ranges is:"); 
					for (j = start2; j <= end2; j++) {
						if (j == i && i <= end1) {
							overlap++;
							i++;
							System.out.print(" " + j + "");
						}
					}
					System.out.print(".");
				}
				
				else if (start2 <= start1 && end1 >= end2) {
					System.out.print("The overlap between the two ranges is:"); 
					for (j = start2; j <= end2; j++) {
						if (j == i && i <= end1) {
							overlap++;
							i++;
							System.out.print(" " + j + "");
							
						}
					}
					System.out.print(".");
					
				} 
				
		// Calculate the percentage overlap between the two ranges.
		
		/*
		 * Your code goes here.
		 */
				
				/*
				 * This segment of code calculates and displays the percentage overlap between the two
				 * ranges. Multiple if-else-if statements are used to account for the various ranges
				 * that may be created.
				 */
				double totalDigits; // Counts how many unique digits appear across the two ranges.
				
		/* Display the percentage overlap to the user.
		 * Your output should read:
		 * 
		 * The percentage overlap between the two ranges is: <PERCENT>
		 * 
		 * See Examples 1-7 from the assignment for how to format your output. 
		 */
		
		/*
		 * Your code goes here.
		 */
				
				if (end2 >= end1 && start1 <= start2) {
					totalDigits = end2 - start1 +1;
					double percentOverlap = overlap * 100 / totalDigits;	
					System.out.println("");
					System.out.printf("The percentage overlap between the two ranges is: %.1f%%", percentOverlap); 
				}
				
				else if (end2 >= end1 && start1 >= start2) {
					totalDigits = end2 - start2 +1;
					double percentOverlap = (overlap * 100) / totalDigits;
					System.out.println("");
					System.out.printf("The percentage overlap between the two ranges is: %.1f%%", percentOverlap); 
				}
				
				else if (end2 <= end1 && start1 >= start2) {
					totalDigits = end1 - start2 +1;
					double percentOverlap = (overlap * 100) / totalDigits;
					System.out.println("");
					System.out.printf("The percentage overlap between the two ranges is: %.1f%%", percentOverlap);  
				}
				
				else if (end2 <= end1 && start1 <= start2) {
					totalDigits = end1 - start1 +1;
					double percentOverlap = (overlap * 100) / totalDigits;
					System.out.println("");
					System.out.printf("The percentage overlap between the two ranges is: %.1f%%", percentOverlap); 
				}
				break; // Ensures the program ends after displaying all necessary information.
			}
		};
	}
}
