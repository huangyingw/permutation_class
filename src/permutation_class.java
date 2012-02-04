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
	public static ArrayList<int[]> permutation(ArrayList<Integer> arr) {
		int[] newArray;
		int data;
		ArrayList<int[]> result = new ArrayList<int[]>();
		if (arr.size() <= 1) {
			return new ArrayList<int[]>(arr.toArray()[0]);
		}

		for (int i = 0; i < arr.size(); i++) {
			data = arr.get(i);
			arr.remove(i);
			for (int[] array : permutation(arr)) {
				newArray = new int[array.length + 1];
				int index = 0;
				newArray[index] = data;
				for (int j = 0; j < array.length; j++) {
					newArray[index++] = array[j];
				}
				result.add(newArray);
			}
		}
		return result;
	}

	public static void main(String args[]) {
	}
}
