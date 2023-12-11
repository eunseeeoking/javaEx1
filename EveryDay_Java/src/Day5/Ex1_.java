package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a [] = new int[5]; //
		int num = 0;
		int cnt = 0;
		for (int i = 0 ; i < a.length ; i ++) {
			System.out.println(cnt + 1 + "번째 값을 입력해 주세요 : ");
			int input = s.nextInt();
			a[i] = input;
			if ( input < 0) {
				System.out.println("1이상의 숫자 입력하셔");
				i--;
			}else {
			cnt ++;
				
			}
			
			
		}System.out.println(Arrays.toString(a));
		
		int min = a[0];
		int max = a[0];
		for (int i=0; i < a.length;i++) {
			max = (a[i] > max) ? a[i] :max;
			min = (a[i] < min) ? a[i] :min;
			}
			
			
		System.out.println(Math.abs(max-min));
	}

}
