package com.futbol;

public class Test {

	public static void main(String[] args) {
		Tak�m tak�m = new Tak�m("Ev sahibi", 4, 4, 2);
		tak�m.tak�mA.forEach(s -> System.out.println(s.pasSkor() + "-" + s.pasVer()));

	}

}
