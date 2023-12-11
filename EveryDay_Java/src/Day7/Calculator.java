package Day7;

import java.util.Arrays;

public class Calculator {

	int sum(int a, int b) {

		return a + b;
	}

	int sum(int a, int b, int c) {

		return a + b + c;
	}

	double sum(int a, double b) {

		return a + b;
	}

	void mix(int a[]) {
		
		// a[] = { 30,12,11,26,35,14,6,9,22 };
		// b[] = { 30,12,26,14,6,22};
		for (int i = 0; i < a.length; i++) {
			int b[] = new int[6];
			for (int j = 0; j < a.length; j++) {
				if (a[i] % 2 == 0) {
					b[j] = a[i]; 
				}

			}

		}

	}
}
