package org.stringexamples;

import java.util.HashSet;

public class TwoElelementsSumEqlToRestOfTheElements {
/**
 *  Check if there exist two elements in an array whose sum is equal to the sum of rest of the array
	Input  : arr[] = {2, 11, 5, 1, 4, 7}
	Output : Elements are 4 and 11
	Note that 4 + 11 = 2 + 5 + 1 + 7
	
	Input  : arr[] = {2, 4, 2, 1, 11, 15}
	Output : Elements do not exist
 * 
 */
	public static void main(String[] args) {
		int arr[] = { 2, 11, 5, 1, 4, 7 };
		int n = arr.length;
		if (checkPair(arr, n) == false) {
			System.out.printf("No pair found");
		}
	}

	// Function to check whether two elements exist
	// whose sum is equal to sum of rest of the elements.
	static boolean checkPair(int arr[], int n) {
		// Find sum of whole array
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		// If sum of array is not even than we can not
		// divide it into two part
		if (sum % 2 != 0) {
			return false;
		}

		sum = sum / 2;

		// For each element arr[i], see if there is
		// another element with value sum - arr[i]
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sum - arr[i];

			// If element exist than return the pair
			if (s.contains(val) && val == (int) s.toArray()[s.size() - 1]) {
				System.out.printf("Pair elements are %d and %d\n", arr[i], val);
				return true;
			}
			s.add(arr[i]);
		}
		return false;
	}
}
