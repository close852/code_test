import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
	static int[] data = { 1, 2, 3, 4 };
	static int[] flag = { 0, 0, 0, 0 };
	static List<List<Integer>> tlists = new ArrayList<>();

	public static void main(String[] args) {
		// List<List<Integer>> lists = new
		powerset(data.length, 0);
		tlists.forEach(System.out::println);
	}

	private static void powerset(int n, int depth) {
		if (n == depth) {
			System.out.println("끝"+Arrays.toString(flag));
			int i;
			List<Integer> lists = new ArrayList<>();
			for (i = 0; i < n; i++) {
				if (flag[i] == 1)
					lists.add(data[i]);
			}
			tlists.add(lists);
			return;
		}
		flag[depth] = 1;
		powerset(n, depth + 1);
		flag[depth] = 0;
		powerset(n, depth + 1);
	}
}
