package com.bilgeadam.oop.ornek;

public class Test {

	public static void main(String[] args) {

//		Anakart anakart = new Anakart();
//		anakart.name = "Asus";
//		anakart.model = "Atx";

		Islemci islemci = new Islemci();
		islemci.islemciH�z� = "3,0 GHz";
		islemci.name = "�ntel";

		Klavye klavye = new Klavye();
		klavye.klavyeTipi = "Q";
		klavye.mekanikMi = true;

		Mouse mouse = new Mouse();
		mouse.agirlik = 50;
		mouse.hassasiyet = 5600;
		mouse.name = "logitech";
		mouse.tusSayisi = 4;

		Ram ram = new Ram();
		ram.h�z� = 400;
		ram.kapasitesi = 16;
		ram.name = "kingston";

		Usb usb = new Usb();
		usb.h�z� = 400;
		usb.tipi = "3.0";

		Diz�st� diz�st� = new Diz�st�();
		diz�st�.pilKKapasitesi = "13000 mAh";
		Anakart anakart = null;
		diz�st�.anaKart = anakart;
		diz�st�.anaKart.model = "asus";
		diz�st�.islemci = islemci;
		diz�st�.islemci.islemciH�z� = "3,3 ghz";
		System.out.println(diz�st�.pilKKapasitesi);
		System.out.println(diz�st�.anaKart.model);
		System.out.println(diz�st�.islemci.islemciH�z�);

		Bilgisayar bilgisayar = new Bilgisayar();
		bilgisayar.anaKart = anakart;
		bilgisayar.islemci = islemci;
		bilgisayar.usb = usb;
		bilgisayar.ram = ram;
		bilgisayar.klavye = klavye;
		bilgisayar.mouse = mouse;

		System.out.println(bilgisayar.ram.name);
		System.out.println(bilgisayar.anaKart.model);
		System.out.println(bilgisayar.islemci.islemciH�z�);
		System.out.println(bilgisayar.usb.h�z�);
		System.out.println(bilgisayar.klavye.klavyeTipi);
		System.out.println(bilgisayar.mouse.agirlik);
	}

}
