package com.bilgeadam.lesson001;

public class question011_06_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 1;
		double t = 0;
		double c = 0;
		while (a < 7) {
			if (a % 2 == 0) {
				t = t + a;
				a++;
			} else {
				c = c + a;
				a++;
			}
		}
		double sum = (double) (c / t);
		System.out.println(sum);
	}

}
