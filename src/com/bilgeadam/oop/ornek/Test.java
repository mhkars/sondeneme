package com.bilgeadam.oop.ornek;

public class Test {

	public static void main(String[] args) {

//		Anakart anakart = new Anakart();
//		anakart.name = "Asus";
//		anakart.model = "Atx";

		Islemci islemci = new Islemci();
		islemci.islemciHýzý = "3,0 GHz";
		islemci.name = "Ýntel";

		Klavye klavye = new Klavye();
		klavye.klavyeTipi = "Q";
		klavye.mekanikMi = true;

		Mouse mouse = new Mouse();
		mouse.agirlik = 50;
		mouse.hassasiyet = 5600;
		mouse.name = "logitech";
		mouse.tusSayisi = 4;

		Ram ram = new Ram();
		ram.hýzý = 400;
		ram.kapasitesi = 16;
		ram.name = "kingston";

		Usb usb = new Usb();
		usb.hýzý = 400;
		usb.tipi = "3.0";

		Dizüstü dizüstü = new Dizüstü();
		dizüstü.pilKKapasitesi = "13000 mAh";
		Anakart anakart = null;
		dizüstü.anaKart = anakart;
		dizüstü.anaKart.model = "asus";
		dizüstü.islemci = islemci;
		dizüstü.islemci.islemciHýzý = "3,3 ghz";
		System.out.println(dizüstü.pilKKapasitesi);
		System.out.println(dizüstü.anaKart.model);
		System.out.println(dizüstü.islemci.islemciHýzý);

		Bilgisayar bilgisayar = new Bilgisayar();
		bilgisayar.anaKart = anakart;
		bilgisayar.islemci = islemci;
		bilgisayar.usb = usb;
		bilgisayar.ram = ram;
		bilgisayar.klavye = klavye;
		bilgisayar.mouse = mouse;

		System.out.println(bilgisayar.ram.name);
		System.out.println(bilgisayar.anaKart.model);
		System.out.println(bilgisayar.islemci.islemciHýzý);
		System.out.println(bilgisayar.usb.hýzý);
		System.out.println(bilgisayar.klavye.klavyeTipi);
		System.out.println(bilgisayar.mouse.agirlik);
	}

}
