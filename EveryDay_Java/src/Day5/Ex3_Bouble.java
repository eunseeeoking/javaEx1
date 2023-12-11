package Day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex3_Bouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 7, 4, 5, 1, 3 };
		int n = 1;
		for (int j = a.length - 1; j >= 1; j--) {
			for (int i = 0; i < j; i++) { // **a.length-1**

				if (a[i] > a[i + 1]) {
					int temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));

//		for (int i=4; i>=0;i--) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(i);
//			}System.out.println();
//		}

	}
}
