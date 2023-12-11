package Day5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class Ex4_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Arrays.sort(a); // 지금쓰지말기 , 프로젝트할땐 써야한다 이눔아 !
//		System.out.println(Arrays.toString(a));
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int cnt = 0;
		for (int i = 0; i <= a.length - 1; i++) {

			System.out.println(cnt + 1 + "번째 값을 입력해 주세요 : ");
			a[i] = s.nextInt();
			cnt++;
		}

		System.out.println(Arrays.toString(a));
		int num1 = 0;
		 for (int m=0;m<=a.length-1;m++) {
			 a[m] = Math.abs(a[m]);
		 }
		for (int p = a.length-1;p>=1;p--){	
		for (int j = 0; j < p; j++) {
				if (a[j] > a[j + 1]) {
					num1 = a[j + 1];
					a[j + 1] = a[j];
					a[j] = num1;
				}
			}
		}System.out.println(Arrays.toString(a));
	}

}
