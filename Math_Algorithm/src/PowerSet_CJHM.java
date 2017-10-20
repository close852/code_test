import java.util.ArrayList;
import java.util.List;

public class PowerSet_CJHM {
	static String[] data;// 원본
	static int[] flag;// flag값

	public static void main(String[] args) {
		int n = 4;
		int depth = 0;
		data = new String[] { "a", "b", "c", "d" };
		flag = new int[data.length];
		List<List<String>> lists = new ArrayList<>();
		powerset(n, depth, lists);
		lists.forEach(System.out::println);
	}

	private static void powerset(int n, int depth, List<List<String>> lists) {
		List<String> list = new ArrayList<>();
		if (n == depth) {
			for (int i = 0; i < n; i++) {
				if (flag[i] == 1) {
					list.add(data[i]);
				}
			}
//			for (int i = 0; i < n; i++) {
//				if (flag[i] == 0) {
//					list.add(data[i]);
//				}
//			}System.out.println(list);
//			System.out.println("==================");
			if(!lists.contains(list))
				lists.add(list);
			return;
		}

		flag[depth] = 1;
		powerset(n, depth + 1, lists);
		flag[depth] = 0;
		powerset(n, depth + 1, lists);

	}
}
