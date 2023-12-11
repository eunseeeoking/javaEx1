package Day5;

import java.util.Arrays;

public class Ex2_Array2 {
	public static void main(String[] args) {

		int a[] = {7,4,5,1,3 };
		// 위 배열에서 짝수들의 합과 홀수들의 합을 구하고
		// 두 수의 차이를 구하시오

//	int sum1 =0;
//	int sum2 =0;
//	for (int i = 0; i<array.length;i++) {
//		if (array[i] % 2 == 0) {
//			sum1 += array[i];
//			}
//		else{
//			sum2 += array[i];
//			
//		}
//	}System.out.println(Math.abs(sum2 -sum1));

		// final 절대 고정되는 수.

		// for-each

		//향상된 for문 ******
//		for (int v : array) {
//			System.out.println(v);
//		}
		int min = a[0];
		int max = a[0];
		int q = a[0];
		for (int i=0;i<a.length;i++) {
			max = (a[i] > max) ? a[i] :max;
			min = (a[i] < min) ? a[i] :min;
			a[q] = a[i];
			a[i] = a[min];
		}
		
		System.out.println(min);

	}
}
