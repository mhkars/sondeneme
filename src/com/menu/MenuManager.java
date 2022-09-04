package com.menu;

import java.util.Random;

public class MenuManager {

	public Enum menuBelirle(Enum[] dizi) {
		int uzunluk = dizi.length;
		int index = randomIndex(uzunluk);

		return dizi[index];
	}

	public int randomIndex(int uzunluk) {
		Random random = new Random();
		return random.nextInt(uzunluk);
	}

	public static void main(String[] args) {
		MenuManager menuManager = new MenuManager();
		for (EGun gun : EGun.values()) {
			System.out.println(gun.ordinal() + 1 + "-" + gun);
			Menu menu = new Menu();
			menu.setCorba((ECorba) menuManager.menuBelirle(ECorba.values()));
			menu.setIcecek((EIcecek) menuManager.menuBelirle(EIcecek.values()));
			menu.setYemek((EYemek) menuManager.menuBelirle(EYemek.values()));
			menu.setTatlý((ETatlý) menuManager.menuBelirle(ETatlý.values()));
			System.out.println(menu);
		}
	}
}
