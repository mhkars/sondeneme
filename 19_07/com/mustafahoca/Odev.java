package com.mustafahoca;

import java.util.HashMap;
import java.util.Random;

public class Odev {

	HashMap<Integer, String> hMap = new HashMap<Integer, String>();

	public void mapOlustur() {

		hMap.put(1, "Adana");
		hMap.put(2, "Ad�yaman");
		hMap.put(3, "Afyonkarahisar");
		hMap.put(4, "A�r�");
		hMap.put(5, "Amasya");
		hMap.put(6, "Ankara");
		hMap.put(7, "Antalya");
		hMap.put(8, "Artvin");
		hMap.put(9, "Ayd�n");
		hMap.put(10, "Bal�kesir");
		hMap.put(11, "Bilecik");
		hMap.put(12, "Bing�l");
		hMap.put(13, "Bitlis");
		hMap.put(14, "Bolu");
		hMap.put(15, "Burdur");
		hMap.put(16, "Bursa");
		hMap.put(17, "�anakkale");
		hMap.put(18, "�ank�r�");
		hMap.put(19, "�orum");
		hMap.put(20, "Denizli");
		hMap.put(21, "Diyarbak�r");
		hMap.put(22, "Edirne");
		hMap.put(23, "Elaz��");
		hMap.put(24, "Erzincan");
		hMap.put(25, "Erzurum");
		hMap.put(26, "Eski�ehir");
		hMap.put(27, "Gaziantep");
		hMap.put(28, "Giresun");
		hMap.put(29, "G�m��hane");
		hMap.put(30, "Hakkari");
		hMap.put(31, "Hatay");
		hMap.put(32, "Isparta");
		hMap.put(33, "Mersin");
		hMap.put(34, "�stanbul");
		hMap.put(35, "�zmir");
		hMap.put(36, "Kars");
		hMap.put(37, "Kastamonu");
		hMap.put(38, "Kayseri");
		hMap.put(39, "K�rkareli");
		hMap.put(40, "K�r�ehir");
	}

	public void PlakaTahmin() {
		mapOlustur();
	}

	public void main(String[] args) {
		Random rd = new Random();
		int plaka = rd.nextInt(1, 41);
		hMap.get(rd);

	}

}
