package com.bilgeadam.lesson002;

public class q41_06_20 {

	public static void main(String[] args) {
		for(int i =1;i<1000 ;i++) {
			asalmi(i);
		}

	}

	public static void asalmi(int sayi) {
		boolean kontrol = true;
		for (int i=2; i < sayi;i++) {
			if (sayi%i==0) {
				System.out.println("asal sayi degildir");
				kontrol=false;
				break;}}
		if (kontrol) {
			System.out.println("asal sayi degildir");
			}
		}
	}
}
