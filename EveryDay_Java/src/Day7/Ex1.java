package Day7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// TODO Auto-generated method stub
//		int a[] = new int[5];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(a));

		int b[] = new int[5];

		for (int i = 0; i < b.length; i++) {
			System.out.println(i + 1 + "번째 숫자를 입력해 주세요 : ");
			b[i] = s.nextInt();

		}
		System.out.println(Arrays.toString(b));

		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		System.out.println(sum);

		for (int i = 2; i <= 9; i++) {
			System.out.println("============ " + i + "단 ===========");
			for (int j = 1; j <= 9; j++) {
				int x = i * j;
				System.out.println(i + " * " + j + " = " + x);
			}
		}
		int c[] = { 1, 4, 3, 5, 2 };
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i]; j++) {
				System.out.print("*");

			}
			System.out.println();

			
			// \n << 문자열에서 줄바꿈의 의미를 갖는 명령어.
		}

	}

}
