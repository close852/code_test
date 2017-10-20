import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CJHM_TEST {
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		List<String> origin = Arrays.asList("a","b","c","d");
		int n=4;
		int depth=0;
		List<List<String>> lists = new ArrayList<>();
		dfs(n,depth,origin,list,lists);
		System.out.println(lists);
	}

	private static void dfs(int n, int depth, List<String> origin, List<String> list, List<List<String>> lists) {
		if(n==depth){
			return;
		}
		for(int i=0;i<n;i++){
			list.add(origin.get(i));
			dfs(n, depth+1, origin, list, lists);
			lists.remove(i);
		}
		depth--;
	}
}
