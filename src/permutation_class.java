import java.util.ArrayList;

public class permutation_class {
	public static ArrayList<int[]> permutation(ArrayList<Integer> arr) {
		return new ArrayList<int[]>(arr.toArray(new int[arr.size()]));
	}
}
