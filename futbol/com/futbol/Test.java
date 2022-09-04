package com.futbol;

public class Test {

	public static void main(String[] args) {
		Takým takým = new Takým("Ev sahibi", 4, 4, 2);
		takým.takýmA.forEach(s -> System.out.println(s.pasSkor() + "-" + s.pasVer()));

	}

}
