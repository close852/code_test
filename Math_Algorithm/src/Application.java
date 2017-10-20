import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

	private static long combination(int n, int r) {
		return factorial(n) / (factorial(r) * (factorial(n - r)));
	}

	private static long factorial(int n) {
		long rst = 1L;
		for (int i = 1; i <= n; i++) {
			rst *= i;
		}
		return rst;
	}

	private static <T> List<List<T>> powerSet(List<T> lists) {
		int size = lists.size();
		List<List<T>> rstLists = new ArrayList<>();
		for(int i=0;i<size;i++){
			System.out.print(size+" : "+i +" = ");
			System.out.println(combination(size, i));
		}
		return null;
	}

	public static void main(String[] args) {
		List<String> lists = Arrays.asList("a", "b", "c", "d");
		powerSet(lists);

	}
}
