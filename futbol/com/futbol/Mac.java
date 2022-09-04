package com.futbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.w3c.dom.ls.LSOutput;

public class Mac {
	List<Takým> takýmList;

	public Mac() {
		takýmList = new ArrayList<Takým>();
		takýmList.add(new Takým("Ev Sahibi", 4, 4, 2));
		takýmList.add(new Takým("Deplasman", 4, 4, 2));
	}

	public void oyna() {
		int index = pasKontrol(12);
		
		for (int i=0; i<3;i++) {
			List<Futbolcu> 
//			if Mac(takýmList.get(0))
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
