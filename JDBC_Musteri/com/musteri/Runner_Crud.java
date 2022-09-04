package com.musteri;

import java.sql.SQLException;

import com.musteri.repository.CRUD;

public class Runner_Crud {

	public static void main(String[] args) throws SQLException {
		CRUD cr = new CRUD("TblSatis");
//		String sql = "insert into tblmusteri (ad,soyad,adres) values ('asaf','KARS','buca')";
//		String sql = "insert into tblmusteri (ad,soyad,adres,telefon,durum) values ('asaf','KARS','Yenimahalle','05552292888',1)";
		cr.ExecuteQuerry("delete from tblmusteri where ad ilike 'asaf'");
	}

}
