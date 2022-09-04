package com.musteri;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Runner {

	public static void main(String[] args) throws Exception {
		Driver.class.forName("org.postgresql.Driver");

		String adress = "jdbc:postgresql://localhost:5432/TblSatis";
		String username = "postgres";
		String password = "root";

		Connection conn = DriverManager.getConnection(adress, username, password);

		String sql = "insert into tblmusteri (ad,soyad,adres,telefon,durum) values ('Halit','KARS','Yenimahalle','05552292888',1)";
		PreparedStatement ps = conn.prepareCall(sql);
		ps.executeUpdate();
		conn.close();

	}

}
