package Day5;

import java.util.Arrays;
import java.util.Random;

public class Ex6_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Random r = new Random();
	
	int a[] = new int[10];
	
	for (int i = 0; i<a.length;i++) {
		a[i] = r.nextInt(100);
	}
	
	System.out.println(Arrays.toString(a));
	
	
	
	
	// 8-1 가장 큰 값의 위치랑 첫번째 값의 위치랑 변경

	for (int i=0;i<a.length -1 ; i++) {
		int min = i;
		for (int j=i+1;j<a.length;j++) {
			if(a[min]>a[j]) {
				min = j;
				
			}
		}
		int temp = a[min];
		a[min] = a[i];
		a[i]=temp;
	}System.out.println(Arrays.toString(a));
	
	for (int i=0;i<a.length-1;i++) {
		int b[] = new int[a.length];
		int sum = i;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
					
			}
		}b[i] = a[sum];
		 
	}
	
	
	
	
	
	
	
	
	
	System.out.println(Arrays.toString(a));
	}

}
