package com.futbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.w3c.dom.ls.LSOutput;

public class Mac {
	List<Tak�m> tak�mList;

	public Mac() {
		tak�mList = new ArrayList<Tak�m>();
		tak�mList.add(new Tak�m("Ev Sahibi", 4, 4, 2));
		tak�mList.add(new Tak�m("Deplasman", 4, 4, 2));
	}

	public void oyna() {
		int index = pasKontrol(12);
		
		for (int i=0; i<3;i++) {
			List<Futbolcu> 
//			if Mac(tak�mList.get(0))
		}
	}

	public int pasKontrol(int index) {
		Random rd = new Random();
		int oyuncuIndex = rd.nextInt(10);
		while (index == oyuncuIndex) {
			oyuncuIndex = rd.nextInt(10);
		}
		return oyuncuIndex;
	}

}
