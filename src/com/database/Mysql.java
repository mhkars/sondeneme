package com.database;

public class Mysql implements IDatabase {
	@Override
	public void add() {
		System.out.println("-> Mysql veritabanýan ekeleme yapildi.");

	}

	@Override
	public void delete() {
		System.out.println("-> Mysql veritabanindan azaltma yapildi.");

	}

	@Override
	public void get() {
		System.out.println("-> Mysql veritabanindan isteninelen veril alindi.");

	}

	@Override
	public void update() {
		System.out.println("-> Mysql veritabaninda güncelleme yapildi.");

	}

	@Override
	public void login() {
		System.out.println("-> Mysql veritabanina giris yapildi.");

	}

}
