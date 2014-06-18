import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class permutation_class {
	public static void main(String args[]) {
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		List<List<Object>> result = permutation(arrayList);
		Iterator<List<Object>> iter = result.iterator();
		System.out.println(result.size());

		while (iter.hasNext()) {
			System.out.print(iter.next().toString());
		}

		System.out.println();
		String str = "1234";
		System.out.println(permutation_str(str).length);
		System.out.println(Arrays.toString(permutation_str(str)));
	}

	public static List<List<Object>> permutation(List<Object> list) {
		List<List<Object>> result = new ArrayList<List<Object>>();
		permutation(null, list, result);
		return result;
	}

	public static void permutation(List<Object> prefix, List<Object> suffix,
			List<List<Object>> result) {
		if (prefix == null) {
			prefix = new ArrayList<Object>();
		}

		if (result == null) {
			result = new ArrayList<List<Object>>();
		}

		if (suffix.size() == 1) {
			ArrayList<Object> newElement = new ArrayList<Object>(prefix);
			newElement.addAll(suffix);
			result.add(newElement);
		}

		for (int i = 0; i < suffix.size(); i++) {
			List<Object> newPrefix = new ArrayList<Object>(prefix);
			List<Object> newSuffix = new ArrayList<Object>(suffix);
			newPrefix.add(newSuffix.get(i));
			newSuffix.remove(i);
			permutation(newPrefix, newSuffix, result);
		}
	}

	private static String[] permutation_str(String orginal) {
		ArrayList<String> list = new ArrayList<String>();

		if (orginal.length() == 1) {
			return new String[] { orginal };
		}
		else {
			for (int i = 0; i < orginal.length(); i++) {
				String remainS = orginal.substring(0, i)
						+ orginal.substring(i + 1, orginal.length());

				for (String element : permutation_str(remainS)) {
					String result = orginal.charAt(i) + element;
					list.add(result);
				}
			}

			return (String[]) list.toArray(new String[list.size()]);
		}
	}
}
