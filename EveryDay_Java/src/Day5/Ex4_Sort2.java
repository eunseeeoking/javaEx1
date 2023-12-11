package Day5;

import java.util.Arrays;

public class Ex4_Sort2 {

	public static void main(String[] args) {
//		
		// TODO Auto-generated method stub

		int a[] = { 9, 6, 7, 2, 5 };
		
		for (int j = 1; j < a.length; j++) {
			int min = j;
			for (int i = j - 1; i < a.length; i++) {
				if (a[min] > a[i]) {
					min = i;
				}
			}
			int tmp = a[min];
			a[min] = a[j - 1];
			a[j - 1] = tmp;
			System.out.println(Arrays.toString(a));
		}
	}
}
