package com.bilgeadam.lesson001;

import java.util.Scanner;

public class odev_06_17 {

	public static void main(String[] args) {
//		**
//		* D�Z� YOK.
//		* Kullan�c� istedi�i uzunlukta bir de�er girebilir ve bu kare ona g�re �izilir.(tek say� olsun)
//		* . . . . .
//		* . . . . .
//		* . . * . .
//		* . . . . .
//		* . . . . .
//		*
//		* 8
//		* 4 6
//		* 2
//		* Hareket i�in bu rakamlar� kullan�n�n.
//		* > bir y�n se� ..: 6 ENTER
//		* . . . . .
//		* . . . . .
//		* . . . * .
//		* . . . . .
//		* . . . . .
//		* Kurallar -> hareket asla kesilmeyecek. y�ld�z karenin s�n�r�na ul�at���nda ba�a d�ner
//		*/
//
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("boyut seciniz");
		int x = sc.nextInt();
		int y = (x * x);
		int l = (x * x) / 2;

		while (true) {

			for (int i = 0; i < y; i++) {
				if (i == l) {
					System.out.print("*" + "   ");
					if ((i + 1) % x == 0) {
						System.out.println("\n");
					}
				} else {
					System.out.print("." + "   ");
					if ((i + 1) % x == 0) {
						System.out.println("\n");
					}
				}
			}

			System.out.println("make a move");
			int move = sc.nextInt();

			if (move == 2) {
				if (l > (y - x)) {
					l = l - (x * (x - 1));
				} else {
					l = l + x;
				}
			} else if (move == 8) {
				if (l < x) {
					l = l + (x * (x - 1));
				} else {
					l = l - x;
				}
			} else if (move == 4) {
				if ((l + 1) % x == 1) {
					l = l + (x - 1);
				} else {
					l = l - 1;
				}
			} else if (move == 6) {
				if ((l + 1) % x == 0) {
					l = l - (x - 1);
				} else {
					l = l + 1;
				}
			}

		}

	}
}
