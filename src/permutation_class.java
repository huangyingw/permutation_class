import java.util.ArrayList;
import java.util.Arrays;

public class permutation_class {
	// Write a recursive static Java method that accepts an array arr of
	// integers argument returns a list of all permutations of these
	// integers.
	//
	// (A permutation of a sequence of integers is a re-arrangement of the
	// integers. For example, one permutation of 1, 3, 4, 8, 2 is 3, 1, 2,
	// 8, 4.) For this problem, you may assume that the input array contains
	// no duplicate entries. Your method should return an ArrayList of int
	// arrays.
	//
	// Next, test your method using a main method; the main method should
	// pass in the following array: [1, 5, 4, 2]; then, it should print to
	// the console the resulting list of permutations.
	// 1,5,4,2
	@SuppressWarnings("null")
	public static ArrayList<int[]> permutation(Arrays arr) {
		ArrayList<int[]> result = null;
		int[] newArr;
		int data;
		if (arr <= 1) {
			result.add(arr);
		}

		for (int i = 0; i < arr.length; i++) {
			data = arr[i];
			arr.newArr = new int[] { arr[i], 1 };
		}

		return result;

		// int[] result = null;
		// return result;
	}

	public static void main(String args[]) {
	}
}
