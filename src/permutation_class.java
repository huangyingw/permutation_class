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
	private static String[] permutation(String orginal) {
		ArrayList<String> list = new ArrayList<String>();
		if (orginal.length() == 1) {
			return new String[] { orginal };
		} else {
			for (int i = 0; i < orginal.length(); i++) {
				String s = orginal.charAt(i) + "";
				String result = "";
				String resultA = result + s;
				String leftS = orginal.substring(0, i)
						+ orginal.substring(i + 1, orginal.length());
				for (String element : permutation(leftS)) {
					result = resultA + element;
					list.add(result);
				}
			}
			return (String[]) list.toArray(new String[list.size()]);
		}
	}

	public static void main(String args[]) {
		String str = "1234";
		System.out.println(permutation(str).length);
		System.out.println(Arrays.toString(permutation(str)));
	}
}
