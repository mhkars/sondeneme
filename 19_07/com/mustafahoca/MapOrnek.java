package com.mustafahoca;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek {

	public static void main(String[] args) {
		String[] ogrenci = { "Ayse", "Ece", "Mahmut" };
		int[] notlar = { 60, 70, 80 };

		Map<String, Integer[]> s�nav = new HashMap<String, Integer[]>();

		for (int i = 0; i < notlar.length; i++) {
			s�nav.put(ogrenci[i], notlar[i]);
		}
		for (Entry<String, Integer> entry : s�nav.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
