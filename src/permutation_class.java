import java.util.ArrayList;
import java.util.Arrays;

public class permutation_class {
	private static String[] permutation(String orginal) {
		ArrayList<String> list = new ArrayList<String>();
		if (orginal.length() == 1) {
			return new String[] { orginal };
		} else {
			for (int i = 0; i < orginal.length(); i++) {
				String result = "";
				String resultA = result + orginal.charAt(i);
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
