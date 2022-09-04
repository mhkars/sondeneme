package com.database;

public class Oracle implements IDatabase {
	@Override
	public void add() {
		System.out.println("-> Oracle veritaban�an ekeleme yapildi.");

	}

	@Override
	public void delete() {
		System.out.println("-> Oracle veritabanindan azaltma yapildi.");

	}

	@Override
	public void get() {
		System.out.println("-> Oracle veritabanindan isteninelen veril alindi.");

	}

	@Override
	public void update() {
		System.out.println("-> Oracle veritabaninda g�ncelleme yapildi.");

	}

	@Override
	public void login() {
		System.out.println("-> Oracle veritabanina giris yapildi.");

	}
}
