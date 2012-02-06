import java.util.ArrayList;
import java.util.Iterator;

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
	//
	// f(12,345) = f(123,45)+f(124,45)+f(125,45)
	public static ArrayList<ArrayList<Object>> permutation(
			ArrayList<Object> list) {
		return permutation(null, list, null);
	}

	public static ArrayList<ArrayList<Object>> permutation(
			ArrayList<Object> prefix, ArrayList<Object> suffix,
			ArrayList<ArrayList<Object>> result) {
		if (prefix == null) {
			prefix = new ArrayList<Object>();
		}
		if (result == null) {
			result = new ArrayList<ArrayList<Object>>();
		}

		if (suffix.size() == 1) {
			ArrayList<Object> newElement = new ArrayList<Object>(prefix);
			newElement.addAll(suffix);
			// prefix.addAll(suffix);
			result.add(newElement);
			// result.add(prefix);
			return result;
		}

		for (int i = 0; i < suffix.size(); i++) {
			ArrayList<Object> newPrefix = new ArrayList<Object>(prefix);
			newPrefix.add(suffix.get(i));
			ArrayList<Object> newSuffix = new ArrayList<Object>(suffix);
			newSuffix.remove(i);
			result.addAll(permutation(newPrefix, newSuffix, result));
		}
		return result;
	}

	public static void main(String args[]) {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		// arrayList.add(4);
		ArrayList<ArrayList<Object>> result = permutation(arrayList);
		Iterator<ArrayList<Object>> iter = result.iterator();
		System.out.println(result.size());
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}
}
