import java.util.ArrayList;
import java.util.Arrays;

public class permutation_class {
	public static void main(String args[]) {
		String str = "1234";
		String[] result = permutation_str(str);
		System.out.println(Arrays.toString(result));
	}

	public static int count = 1;

	// 1234=1,234+2,134+3,124+4,123
	private static String[] permutation_str(String original) {
		String str = null;
		String remain = "";
		ArrayList<String> result = new ArrayList<String>();
		if (original.length() == 1) {
			return new String[] { original };
		}
		for (int i = 0; i < original.length(); i++) {
			remain = original.substring(0, i)
					+ original.substring(i + 1, original.length());
			for (String element : permutation_str(remain)) {
				str = original.charAt(i) + element;
				result.add(str);
				System.out.println("add->" + str);
			}
		}
		System.out.println(count++);
		return (String[]) result.toArray(new String[result.size()]);
	}
}
