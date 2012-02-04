import java.util.ArrayList;

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

	public static ArrayList<ArrayList<Object>> permutations(
			ArrayList<Object> list) {
		return permutations(null, list, null);
	}

	public static ArrayList<ArrayList<Object>> permutations(
			ArrayList<Object> prefix, ArrayList<Object> suffix,
			ArrayList<ArrayList<Object>> output) {
		if (prefix == null)
			prefix = new ArrayList<Object>();
		if (output == null)
			output = new ArrayList<ArrayList<Object>>();
		if (suffix.size() == 1) {
			ArrayList<Object> newElement = new ArrayList<Object>(prefix);
			newElement.addAll(suffix);
			output.add(newElement);
			return output;
		}
		for (int i = 0; i < suffix.size(); i++) {
			ArrayList<Object> newPrefix = new ArrayList<Object>(prefix);
			newPrefix.add(suffix.get(i));
			ArrayList<Object> newSuffix = new ArrayList<Object>(suffix);
			newSuffix.remove(i);
			permutations(newPrefix, newSuffix, output);
		}
		return output;
	}

	public static void main(String args[]) {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		ArrayList<ArrayList<Object>> result = permutations(arrayList);
		java.util.Iterator<ArrayList<Object>> iter = result.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}
}
