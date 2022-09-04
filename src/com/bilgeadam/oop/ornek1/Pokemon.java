package com.bilgeadam.oop.ornek1;

public class Pokemon {
	String name;
	String type;
	int health;

	public Pokemon(String isim, int can) {
		name = isim;
		health = can;
	}

	public void dodge() {
		System.out.println(name + "adlý pokemon ataðý savuþturdu");
	}

	public void attack() {
		System.out.println(name + " adlý pokemon saldýrýyor");
	}
}
