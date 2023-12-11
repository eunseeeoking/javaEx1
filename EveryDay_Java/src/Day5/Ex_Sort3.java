package Day5;

import java.util.Arrays;
import java.util.concurrent.Delayed;

public class Ex_Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열에서 중복 제거
		// array[] = {10,20,5,10,30,5,10,25}
		// 결과 array[] = {10 , 20 , 5 , 30 , 25}

		int a[] = { 10, 20, 5, 10, 30, 5, 10, 25 };

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
		
//		int b[] = new int[5];
//		int cnt = 0;
//		for (int i = 0 ; i < a.length;i++) {
//			boolean flag =false;
//			for (int j=0; j< a.length;j++ ) {
//				if (a[i] == b[j]) {
//					flag = true;
//					System.out.println(Arrays.toString(b));
//				}
//				if(!flag) {
//					b[cnt++]=a[i];
//				}
//				
//			}
//		}
//		
//		int[] result = new int[cnt];
//		for(int i = 0; i < result.length; i++){
//			result[i] = b[i];
//		}
//		System.out.println(Arrays.toString(result));
		
		
		
		
		
//		for (int i = 0; i < 10; i++) {
//			nums[i] = (int) (Math.random() * 10);
//		}
//		System.out.println("<정렬 전>");
//		System.out.println(Arrays.toString(nums));
//		
//		for(int i = 0; i < nums.length - 1; i++) {
//			// 현재 탐색에서 가장 앞의 원소를 초기 값으로 설정해둔다.
//			int MinIndex = i;
//			// 탐색을 진행하며, 가장 작은 값을 찾는다.
//			for(int j = i + 1; j < nums.length; j++) {
//				if(nums[MinIndex] > nums[j])
//					MinIndex = j;
//			}
//			// 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준다.
//			int temp = nums[MinIndex];
//			nums[MinIndex] = nums[i];
//			nums[i] = temp;
//		}
//		
//		System.out.println("<정렬 후>");
//		System.out.println(Arrays.toString(nums));

	}
}
