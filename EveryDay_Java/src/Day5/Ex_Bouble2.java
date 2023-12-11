package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Bouble2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		

//		int min = a[0];
//		int max = a[0];
//		int tmp = 0;
//		for (int j = a.length - 1; j >= 1; j--)
//			for (int i = 0; i < j; i++) {
//				if (a[i] < a[i + 1]) {
//					tmp = a[i + 1];
//					a[i + 1] = a[i];
//					a[i] = tmp;
//
//				}
//			}
//		System.out.println(Arrays.toString(a));

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// int a[] = { 3, 1, 2, 5, 4 };
		
		
		int a[] = { 3, 22, 6, 10, 4 };
		
		
		
		int tmp = 0;          
		for (int i = 0; i<a.length-1;i++) {
			
			if (a[i]>a[i+1]) {
				tmp = a[i+1];
				a[i+1] = a[i];
				a[i] = tmp;
			}
			
		}System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
