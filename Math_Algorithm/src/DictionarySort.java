import java.util.Arrays;

public class DictionarySort {

	public static void main(String[] args) {
		String str = "abcde";
		char[] temp = str.toCharArray();
		boolean flag = false;
		while (true) {

			int k = 0;
			int l = 0;
			int len = temp.length;
			System.out.println(Arrays.toString(temp));
			for (int i = 0; i < temp.length; i++) {
				if ((i + 1 < len) && temp[i] < temp[i + 1]) {
//					System.out.println(i+" : "+temp[i]+" : "+temp[i+1]);
					k = i;
					l = k + 1;
				}
				if((i>=l+1) && temp[i]>=temp[k]){
					l=i;
				}
				System.out.println(k+" : "+i+" : "+l+">>> temp[i]="+temp[i]+" // temp[l]="+temp[l]);
			}
				if (k == 0 && l == 0) {
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>real?");
					flag = true;
					break;
				}
				// swap 하는 구간
				char c = temp[k];
				temp[k] = temp[l];
				temp[l] = c;

				// 역순정렬
				for (int j = 1; j < l / 2; j++) {
					char t = temp[k + j];
					temp[k + j] = temp[len - j];
					temp[len - j] = t;
				}
			if (flag) {
				break;
			}
		}
	}
}
