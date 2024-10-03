package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week4 {

	public static void main(String[] args) {

		/**
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93.
		 * 
		 * a. Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code). Print the result to the console.
		 * 
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be
		 * longer than the ages array, and have more elements).
		 * 
		 * i. Make sure that there are 9 elements of type int in this new array.
		 * 
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		 * value of the first element in the new array ages2 from the last element of
		 * ages2).
		 * 
		 * iii. Show that using the index values for the elements is dynamic (works for
		 * arrays of different lengths).
		 * 
		 * c. Use a loop to iterate through the array and calculate the average age.
		 * Print the result to the console.
		 */
		// Create the initial ages array
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

		// a. Subtract first element from last element
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("1a. Result of subtracting first from last element: " + result);

		// b. Create a new array ages2 with 9 elements
		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 100 };

		// b.ii. Repeat subtraction for ages2
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("1b.ii. Result for ages2: " + result2);

		// b.iii. Demonstrate dynamic nature
		System.out.println("1b.iii. Demonstrating dynamic nature:");
		System.out.println("  Length of ages: " + ages.length);
		System.out.println("  Length of ages2: " + ages2.length);
		System.out.println("  This shows the code works for arrays of different lengths.");

		// c. Calculate average age using a loop
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		double average = (double) sum / ages.length;
		System.out.println("c. Average age: " + average);

		/**
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * 
		 * a. Use a loop to iterate through the array and calculate the average number
		 * of letters per name. Print the result to the console.
		 * 
		 * b. Use a loop to iterate through the array again and concatenate all the
		 * names together, separated by spaces, and print the result to the console.
		 * 
		 **/
		// Create the array of names
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// a. Calculate average number of letters per name
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println("2a. Average number of letters per name: " + averageLetters);

		// b. Concatenate all names together, separated by spaces
		StringBuilder concatenatedNames = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			concatenatedNames.append(names[i]);
			if (i < names.length - 1) {
				concatenatedNames.append(" ");
			}
		}
		System.out.println("2b. Concatenated names: " + concatenatedNames.toString());
		/**
		 * 3. How do you access the last element of any array?
		 * 
		 **/
		System.out.println("3. The getlast method");
		/**
		 * 
		 * 4. How do you access the first element of any array
		 **/
		System.out.println("4. getfirst method");
		/**
		 * 
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 **/

		// Create a new array nameLengths
		int[] nameLengths = new int[names.length];

		// Loop to iterate over names and populate nameLengths
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}

		for (int length : nameLengths) {
			// Print the nameLengths array to verify
			System.out.println("5. Name lengths:" + length);
//			System.out.print(length + " ");

			/**
			 * 
			 * 
			 * 
			 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
			 * of all the elements in the array. Print the result to the console.
			 **/

			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}

			// Calculate the sum of elements in nameLengths
			sum = 0;
			for (int lengthOfNames : nameLengths) {
				sum += length;
			}

			// Print the result to the console
			System.out.println("6. The sum of all name lengths is: " + sum);
			/**
			 * 
			 * 7. Write a method that takes a String, word, and an int, n, as arguments and
			 * returns the word concatenated to itself n number of times. (i.e. if I pass in
			 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
			 **/
			System.out.println("7. " + repeatWord("Hello", 3));
			/**
			 * 
			 * 8. Write a method that takes two Strings, firstName and lastName, and returns
			 * a full name (the full name should be the first and the last name as a String
			 * separated by a space).
			 **/
			System.out.println("8." + createFullName("John", "Doe"));
			/**
			 * 
			 * 9. Write a method that takes an array of int and returns true if the sum of
			 * all the ints in the array is greater than 100.
			 **/
			int[] array1 = { 50, 60, 10 }; // Sum: 120
			int[] array2 = { 25, 30, 40 };

			System.out.println("9a. Array 1: " + isSumGreaterThan100(array1));
			System.out.println("9b. Array 2: " + isSumGreaterThan100(array2));
			/**
			 * 
			 * 10. Write a method that takes an array of double and returns the average of
			 * all the elements in the array.
			 **/
			double[] array3 = { 1.5, 2.5, 3.5, 4.5, 5.5 };
			double[] array4 = { 10.0, 20.0, 30.0 };

			System.out.println("10a. Average of array1: " + calculateAverage(array3));
			System.out.println("10b. Average of array2: " + calculateAverage(array4));
			/**
			 * 
			 * 11. Write a method that takes two arrays of double and returns true if the
			 * average of the elements in the first array is greater than the average of the
			 * elements in the second array.
			 **/
			double[] array5 = { 1.5, 2.5, 3.5, 4.5, 5.5 };
			double[] array6 = { 1.0, 2.0, 3.0 };

			System.out.println("11a. Is average of array5 > array6? " + isFirstArrayAverageGreater(array5, array6));
			System.out.println("11b. Is average of array3 > array5? " + isFirstArrayAverageGreater(array3, array5));
			/**
			 * 
			 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
			 * a double moneyInPocket, and returns true if it is hot outside and if
			 * moneyInPocket is greater than 10.50.**/
			System.out.println("12a. Will buy drink (hot, $15): " + willBuyDrink(true, 15.00));
	        System.out.println("12b. Will buy drink (cold, $10): " + willBuyDrink(false, 10.00));
		
			/**
			 * 
			 * 13. Create a method of your own that solves a problem. In comments, write
			 * what the method does and why you created it**/
	        System.out.println("13a. Should see movie (good review, $12): " + shouldSeeMovie(true, 12.00));
	        System.out.println("13b. Should see movie (good review, $16): " + shouldSeeMovie(true, 16.00));
	      
		}

	}

	// 7.
	public static String repeatWord(String word, int n) {
		if (n < 0) {
			return ""; // Return empty string for negative n
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(word);
		}
		return result.toString();
	}

	// 8.
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	// 9.
	public static boolean isSumGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum > 100;
	}

	// 10.
	public static double calculateAverage(double[] numbers) {
		if (numbers.length == 0) {
			return 0.0; // Return 0 for an empty array to avoid division by zero
		}

		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}

		return sum / numbers.length;
	}

	// 11.
	public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
		double sum1 = 0, sum2 = 0;

		for (double num : array1) {
			sum1 += num;
		}

		for (double num : array2) {
			sum2 += num;
		}

		double avg1 = array1.length > 0 ? sum1 / array1.length : 0;
		double avg2 = array2.length > 0 ? sum2 / array2.length : 0;

		return avg1 > avg2;
	}

	// 12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	//13
/**
 * This a boolean method to determine if I should go see a movie in the theater based on movie's reviews and the cost of the ticket. 
 * @param goodReview
 * @param ticketCost
 * @return
 */
	
	  public static boolean shouldSeeMovie(boolean goodReview, double ticketCost) {
	        return goodReview && ticketCost < 15.00;
	    }

}
