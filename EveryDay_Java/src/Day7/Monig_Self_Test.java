package Day7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Monig_Self_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 5, 10, 30, 5, 10, 25 };

		// 결과 {10, 20, 5, 30, 25}
		int b[] = new int[5];
		int cnt = 0;

//		for (int i = 0 ; i < a.length; i ++ ) {
//			boolean f = false;
//			for( int j = 0 ; j < b.length; j ++) {
//				if ( a[i] == b [j]) {
//					f = true;
//				}
//				
//			}if (!f) {
//
//				b[cnt++] = a[i];
//			}
//			
//		}System.out.println(Arrays.toString(b));
		
		for (int i = 0; i < a.length; i++) {
			boolean f = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					f = true;

				}

			}
			if (!f) {
				b[cnt++] = a[i];
			}
		}System.out.println(Arrays.toString(b));
		
		int c[] = new int [5];
		
		for (int i = 0 ; i < b.length ; i++) {
			int min = i;
			for (int j = 0 ; j < b.length ; j ++) {
				if ( b[j] <b[min])
				{
					min = j;
				} int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
			
		}System.out.println(Arrays.toString(c));

	}

}
