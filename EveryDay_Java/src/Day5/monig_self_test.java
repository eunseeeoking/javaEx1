package Day5;

import java.util.Random;
import java.util.Scanner;

public class monig_self_test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		
		
		
		System.out.println("문제 수를 입력해 주세요 : ");
		int num1 = s.nextInt();
		for (int i =0;i<=num1;i++) {
			int q1 = r.nextInt(8)+2;
			int q2 = r.nextInt(9)+1;
			int b = q1 * q2;
			int cnt = 0;
			System.out.println(q1+ " * " + q2 + " = " );
			int a = s.nextInt();
			if (b == a) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
		}
	}
}
