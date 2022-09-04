package com.musteri.repository;

import static com.musteri.utility.Constants.DATABASE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.musteri.repository.entity.Musteri;

public class Musteri_Repository implements ICrud<Musteri> {
	private CRUD cr;
	private ResultSet rs;

	public Musteri_Repository() {
		cr = new CRUD(DATABASE);
	}

	@Override
	public void save(Musteri t) {
		String SQL = "insert into tblmusteri(ad,soyad,adres,telefon) values " + "('" + t.getAd() + "','" + t.getSoyad()
				+ "','" + t.getAdres() + "','" + t.getTel() + "')";

		try {
			cr.ExecuteQuerry(SQL);
		} catch (SQLException e) {
			System.out.println("Saving Error...: " + e.toString());
		}
	}

	@Override
	public void update(Musteri t) {
		String SQL = "update tblmusteri " + "set ad='" + t.getAd() + "', " + "soyad='" + t.getSoyad() + "'," + "adres='"
				+ t.getAdres() + "', " + "telefon='" + t.getTel() + "'," + "durum=" + t.getDurum() + " where id="
				+ t.getId();
		try {
			cr.ExecuteQuerry(SQL);
		} catch (SQLException e) {
			System.out.println("Updating Error...: " + e.toString());
		}

	}

	@Override
	public void delete(int id) {
		String SQL = "delete from tblmusteri where id=" + id;
		try {
			cr.ExecuteQuerry(SQL);
		} catch (SQLException e) {
			System.out.println("Deleting Error...: " + e.toString());
		}
	}

	@Override
	public List<Musteri> findAll() {
		List<Musteri> mlist = new ArrayList();
		try {
			rs = cr.FindAll("select * from tblmusteri");
			while (rs.next()) {
				int id = rs.getInt("id"); // rs.getInt(1);
				String ad = rs.getString("ad");// rs.getInt(2);
				String soyad = rs.getString("soyad");
				String adres = rs.getString("adres");
				String telefon = rs.getString("telefon");
				int durum = rs.getInt("durum");
				mlist.add(new Musteri(id, ad, soyad, telefon, adres, durum));
			}
		} catch (SQLException e) {
			System.out.println("Table Error...: " + e.toString());
		}

		return mlist;
	}

	@Override
	public Musteri findById(int id) {
		Musteri cs = null;
		try {
			rs = cr.FindAll("select * from tblmusteri where id=" + id);
			while (rs.next()) {
				String ad = rs.getString("ad");// rs.getInt(2);
				String soyad = rs.getString("soyad");
				String adres = rs.getString("adres");
				String telefon = rs.getString("telefon");
				int durum = rs.getInt("durum");
				cs = new Musteri(id, ad, soyad, telefon, adres, durum);
			}
		} catch (Exception e) {
			System.out.println("Table Error...: " + e.toString());
		}
		return cs;
	}

	@Override
	public List<Musteri> findByColumnValue(String columnName, Object value) {
		List<Musteri> mlist = new ArrayList();
		try {
			try {
				String Svalue = (String) value;
				rs = cr.FindAll("select * from tblmusteri where " + columnName + " ilike ('" + Svalue + "')");
			} catch (Exception e) {
				rs = cr.FindAll("select * from tblmusteri where " + columnName + "=" + value);
			}
			while (rs.next()) {
				int id = rs.getInt("id");
				String ad = rs.getString("ad");
				String soyad = rs.getString("soyad");
				String adres = rs.getString("adres");
				String telefon = rs.getString("telefon");
				int durum = rs.getInt("durum");
				mlist.add(new Musteri(id, ad, soyad, telefon, adres, durum));
			}
		} catch (Exception e) {
			System.out.println("Table Error...: " + e.toString());
		}

		return mlist;
	}

}
